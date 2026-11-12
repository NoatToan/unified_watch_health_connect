package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes14.dex */
class ShapeableDelegateV33 extends ShapeableDelegate {
    public ShapeableDelegateV33(View view2) {
        initMaskOutlineProvider(view2);
    }

    private void initMaskOutlineProvider(View view2) {
        view2.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view3, Outline outline) {
                if (ShapeableDelegateV33.this.shapePath.isEmpty()) {
                    return;
                }
                outline.setPath(ShapeableDelegateV33.this.shapePath);
            }
        });
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(View view2) {
        view2.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view2.invalidate();
        } else {
            view2.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}
