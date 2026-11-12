package com.garmin.android.apps.connectmobile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/f;", "Lcom/garmin/android/apps/connectmobile/b0;", "", "contentLayoutId", "", "isFullScreen", "shouldScrollToBottom", "isResizable", "<init>", "(IZZZ)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k32.a f34928g;

    public /* synthetic */ f(int i14, boolean z14, boolean z15, boolean z16, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? false : z16);
    }

    public boolean A6() {
        return this instanceof mh1.k;
    }

    public abstract void C6();

    public void E6() {
        if (!A6()) {
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).n();
            return;
        }
        r22.y.a aVar = r22.y.f149923b;
        b41.a aVar2 = new b41.a(this, 26);
        aVar.getClass();
        r22.y yVar = new r22.y();
        yVar.f149924a = aVar2;
        yVar.show(getParentFragmentManager(), (String) null);
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void v6(View view2) {
        k32.a aVar = new k32.a(view2);
        this.f34928g = aVar;
        String strZ6 = z6();
        e eVar = new e(this, 0);
        String strY6 = y6();
        e eVar2 = new e(this, 1);
        v22.e.v(aVar.f102662a, this.f34927f);
        aVar.f102664c.setText(strZ6);
        iz1.f fVar = new iz1.f(eVar, 14);
        ImageView imageView = aVar.f102663b;
        v22.e.n(imageView, fVar);
        v22.e.v(imageView, !(this instanceof mh1.k));
        imageView.setImageResource(R.drawable.arrow_left);
        TextView textView = aVar.f102665d;
        textView.setText(strY6);
        v22.e.n(textView, new iz1.f(eVar2, 15));
    }

    public final void w6() {
        k32.a aVar = this.f34928g;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("headerViewHolder");
            throw null;
        }
        aVar.f102665d.setEnabled(A6());
    }

    public String y6() {
        String string = getString(R.string.lbl_save);
        string.getClass();
        return string;
    }

    public abstract String z6();

    public f(int i14, boolean z14, boolean z15, boolean z16) {
        super(R.layout.action_bottom_sheet_header, i14, z14, z15, z16);
        this.f34927f = z16;
    }
}
