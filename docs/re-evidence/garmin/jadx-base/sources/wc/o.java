package wc;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.y0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lwc/o;", "Lwc/h;", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedDispatcher", "", "onBackInvokedCallbackPriority", "<init>", "(Landroid/window/OnBackInvokedDispatcher;I)V", "Lwc/m;", "Lwc/p;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f184262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f184263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f184264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f184265f;

    private o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i14) {
        this.f184262c = onBackInvokedDispatcher;
        this.f184263d = i14;
        this.f184264e = Build.VERSION.SDK_INT == 33 ? new y0(this, 4) : new n(this);
    }

    @Override // wc.h
    public final void b(boolean z14) {
        if (z14 && !this.f184265f) {
            this.f184262c.registerOnBackInvokedCallback(this.f184263d, this.f184264e);
            this.f184265f = true;
        } else {
            if (z14 || !this.f184265f) {
                return;
            }
            this.f184262c.unregisterOnBackInvokedCallback(this.f184264e);
            this.f184265f = false;
        }
    }

    public /* synthetic */ o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i14, p005kotlin.jvm.internal.j jVar) {
        this(onBackInvokedDispatcher, i14);
    }
}
