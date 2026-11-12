package com.garmin.android.apps.connectmobile.social.share;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/a;", "Lcom/garmin/android/apps/connectmobile/social/share/e$a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/app/Activity;", "activity", "", "layoutResId", "(Landroid/app/Activity;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44642a;

    public a(Activity activity, int i14) {
        activity.getClass();
        View viewInflate = LayoutInflater.from(activity).inflate(i14, (ViewGroup) null, false);
        viewInflate.getClass();
        this.f44642a = viewInflate;
        viewInflate.setLayoutDirection(activity.getWindow().getDecorView().getLayoutDirection());
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.e.a
    public void draw(Canvas canvas) {
        canvas.getClass();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(canvas.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(canvas.getHeight(), 1073741824);
        View view2 = this.f44642a;
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        view2.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        view2.draw(canvas);
    }

    public a(View view2) {
        view2.getClass();
        this.f44642a = view2;
    }
}
