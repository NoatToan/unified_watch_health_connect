package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/devices/targetedselection/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends RecyclerView.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34594c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f34595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f34596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view2, d dVar) {
        super(view2);
        view2.getClass();
        dVar.getClass();
        this.f34595a = dVar;
        this.f34596b = (TextView) view2.findViewById(R.id.name);
    }
}
