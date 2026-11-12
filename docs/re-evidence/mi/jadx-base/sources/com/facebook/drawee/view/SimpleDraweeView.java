package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import defpackage.b6i;
import defpackage.epa;
import defpackage.idq;
import defpackage.tpo;
import defpackage.x3j;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleDraweeView extends GenericDraweeView {
    public static tpo<? extends AbstractDraweeControllerBuilder> h;
    public AbstractDraweeControllerBuilder g;

    public SimpleDraweeView(Context context) {
        super(context);
        h(context, null);
    }

    public static void i(tpo<? extends AbstractDraweeControllerBuilder> tpoVar) {
        h = tpoVar;
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.g;
    }

    public final void h(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (epa.d()) {
                epa.a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                b6i.h(h, "SimpleDraweeView was not initialized!");
                this.g = h.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x3j.E);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(x3j.G)) {
                        k(Uri.parse(typedArrayObtainStyledAttributes.getString(x3j.G)), null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(x3j.F) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(x3j.F, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th2) {
            if (epa.d()) {
                epa.b();
            }
            throw th2;
        }
    }

    public void j(int i, Object obj) {
        k(idq.c(i), obj);
    }

    public void k(Uri uri, Object obj) {
        setController(this.g.y(obj).a(uri).b(getController()).build());
    }

    public void l(String str, Object obj) {
        k(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i) {
        j(i, null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.g.A(imageRequest).b(getController()).build());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        k(uri, null);
    }

    public void setImageURI(String str) {
        l(str, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(context, attributeSet);
    }
}
