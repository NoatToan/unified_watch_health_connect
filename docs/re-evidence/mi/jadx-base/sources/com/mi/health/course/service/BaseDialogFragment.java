package com.mi.health.course.service;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f9999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10000b;
    public a c;

    public interface a {
        void a();
    }

    public boolean isShowing() {
        return getDialog() != null && getDialog().isShowing();
    }

    public void setOnNegativeClickListener(a aVar) {
        this.f10000b = aVar;
    }

    public void setOnNeutralClickListener(a aVar) {
        this.f9999a = aVar;
    }

    public void setOnPositiveClickListener(a aVar) {
        this.c = aVar;
    }

    public void show(FragmentManager fragmentManager) {
        show(fragmentManager, t());
    }

    public abstract String t();

    public final /* synthetic */ void u(DialogInterface dialogInterface, int i) {
        a aVar = this.f9999a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void v(c.a aVar, int i) {
        aVar.q(i, new DialogInterface.OnClickListener() { // from class: z62
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f40935a.u(dialogInterface, i2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        try {
            k kVarO = fragmentManager.o();
            kVarO.f(this, str);
            kVarO.m();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("show dialog ");
            sb.append(str);
            sb.append(" error: ");
            sb.append(e.getMessage());
        }
    }
}
