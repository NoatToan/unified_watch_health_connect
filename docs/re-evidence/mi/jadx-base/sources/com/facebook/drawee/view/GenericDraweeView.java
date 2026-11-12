package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.aya;
import defpackage.bya;
import defpackage.epa;
import defpackage.zxa;

/* JADX INFO: loaded from: classes4.dex */
public class GenericDraweeView extends DraweeView<zxa> {
    public GenericDraweeView(Context context, zxa zxaVar) {
        super(context);
        setHierarchy(zxaVar);
    }

    public void g(Context context, AttributeSet attributeSet) throws Throwable {
        if (epa.d()) {
            epa.a("GenericDraweeView#inflateHierarchy");
        }
        aya ayaVarD = bya.d(context, attributeSet);
        setAspectRatio(ayaVarD.f());
        setHierarchy(ayaVarD.a());
        if (epa.d()) {
            epa.b();
        }
    }

    public GenericDraweeView(Context context) throws Throwable {
        super(context);
        g(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        g(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        g(context, attributeSet);
    }
}
