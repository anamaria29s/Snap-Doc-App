// Generated by view binder compiler. Do not edit!
package com.example.snapdoc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snapdoc.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentImageListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton addImageFab;

  @NonNull
  public final RecyclerView imagesRv;

  private FragmentImageListBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton addImageFab, @NonNull RecyclerView imagesRv) {
    this.rootView = rootView;
    this.addImageFab = addImageFab;
    this.imagesRv = imagesRv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentImageListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentImageListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_image_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentImageListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addImageFab;
      FloatingActionButton addImageFab = ViewBindings.findChildViewById(rootView, id);
      if (addImageFab == null) {
        break missingId;
      }

      id = R.id.imagesRv;
      RecyclerView imagesRv = ViewBindings.findChildViewById(rootView, id);
      if (imagesRv == null) {
        break missingId;
      }

      return new FragmentImageListBinding((RelativeLayout) rootView, addImageFab, imagesRv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
