// Generated by view binder compiler. Do not edit!
package com.example.buggy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.example.buggy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button button3;

  private ActivityMain2Binding(@NonNull CoordinatorLayout rootView, @NonNull Button button3) {
    this.rootView = rootView;
    this.button3 = button3;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      Button button3 = rootView.findViewById(id);
      if (button3 == null) {
        break missingId;
      }

      return new ActivityMain2Binding((CoordinatorLayout) rootView, button3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
