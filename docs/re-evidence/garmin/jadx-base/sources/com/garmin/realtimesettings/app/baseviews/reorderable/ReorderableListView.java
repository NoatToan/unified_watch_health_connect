package com.garmin.realtimesettings.app.baseviews.reorderable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import cx2.h;
import dx2.c;
import e23.l;
import gw2.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import wv2.g;
import wv2.k;
import xv2.d;
import xv2.e;
import xv2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0007\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/garmin/realtimesettings/app/baseviews/reorderable/ReorderableListView;", "Lfw2/a;", "Lwv2/g;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lwv2/k;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lwv2/k;Ldx2/c;Ljava/util/Map;)V", "b", "Lwv2/g;", "getActionListener", "()Lwv2/g;", "setActionListener", "(Lwv2/g;)V", "actionListener", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReorderableListView extends fw2.a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f52542c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.realtimesettings.app.baseviews.reorderable.b f52543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public g actionListener;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52545a;

        public b(l lVar) {
            lVar.getClass();
            this.f52545a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52545a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52545a.invoke(obj);
        }
    }

    static {
        new a(null);
        f52542c = new h("ReorderableListView", null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListView(Fragment fragment, k kVar, c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        kVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (j) (0 == true ? 1 : 0));
        f fVarO4 = cVar.O4(map);
        if (fVarO4 == null) {
            f52542c.d(null, "Invalid reorderable list options for Row ID: " + map.get(i.ROW_ID.f79975a));
            return;
        }
        com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = this.f52543a;
        gw2.h hVar = fVarO4.f192288b;
        bVar.getClass();
        bVar.f52549b = hVar;
        com.garmin.realtimesettings.app.baseviews.reorderable.b bVar2 = this.f52543a;
        com.garmin.realtimesettings.app.presentationlayer.c cVar2 = (com.garmin.realtimesettings.app.presentationlayer.c) fragment;
        NestedScrollView nestedScrollView = cVar2.f52650j;
        if (nestedScrollView == null) {
            s.m("nestedScrollView");
            throw null;
        }
        bVar2.f52556i = nestedScrollView;
        List<e> list = fVarO4.f192290d;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            e eVar = (e) obj;
            arrayList.add(new wv2.a(i14, kVar.b(eVar.f192284b), eVar.f192285c, new d(eVar.f192283a, null, 2, null), eVar.f192286d));
            i14 = i15;
        }
        bVar2.getClass();
        List<wv2.a> list2 = bVar2.f52548a;
        list2.clear();
        list2.addAll(arrayList);
        bVar2.notifyDataSetChanged();
        cVar.f61486c.f(cVar2.getViewLifecycleOwner(), new b(new wn2.f(this, 3, cVar, map)));
    }

    @Override // wv2.g
    public final void f(int i14, int i15) {
        g gVar = this.actionListener;
        if (gVar != null) {
            gVar.f(i14, i15);
        }
    }

    public final g getActionListener() {
        return this.actionListener;
    }

    @Override // wv2.g
    public final void h(int i14, gw2.h hVar, boolean z14) {
        hVar.getClass();
        g gVar = this.actionListener;
        if (gVar != null) {
            gVar.h(i14, hVar, z14);
        }
    }

    public final void setActionListener(g gVar) {
        this.actionListener = gVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/baseviews/reorderable/ReorderableListView$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ ReorderableListView(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        com.garmin.realtimesettings.app.baseviews.reorderable.b bVar = new com.garmin.realtimesettings.app.baseviews.reorderable.b(null, null, this, null, 11, null);
        this.f52543a = bVar;
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new com.garmin.realtimesettings.app.baseviews.reorderable.a(bVar));
        View.inflate(context, R.layout.rts_reorderable_list_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        bVar.f52551d = sVar;
        sVar.e(recyclerView);
        recyclerView.setAdapter(bVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.garmin.realtimesettings.app.baseviews.reorderable.ReorderableListView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public final boolean canScrollVertically() {
                return false;
            }
        });
    }
}
