package com.garmin.android.apps.connectmobile.draggableimagepreviewer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ef0.d;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a$a;", "", "maxImageCount", "<init>", "(I)V", "a", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends RecyclerView.h<AbstractC0587a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f34731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f34732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f34733d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.draggableimagepreviewer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC0587a extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0587a(View view2) {
            super(view2);
            view2.getClass();
        }

        public abstract void d(ef0.b bVar);
    }

    public interface b {
        void a(ef0.b bVar);
    }

    public a(int i14) {
        this.f34730a = i14;
        this.f34731b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f34731b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        AbstractC0587a abstractC0587a = (AbstractC0587a) f0Var;
        abstractC0587a.getClass();
        ef0.b bVar = (ef0.b) h0.e0(i14, this.f34731b);
        if (bVar != null) {
            abstractC0587a.d(bVar);
        }
    }

    public a() {
        this(0, 1, null);
    }

    public /* synthetic */ a(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 10 : i14);
    }
}
