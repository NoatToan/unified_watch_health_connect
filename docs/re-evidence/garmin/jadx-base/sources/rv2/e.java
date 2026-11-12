package rv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gw2.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o13.h;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrv2/e;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/core/widget/NestedScrollView;", "nestedScrollView", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Landroidx/core/widget/NestedScrollView;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends fw2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f154771b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f154772a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f154773a;

        public a(l lVar) {
            lVar.getClass();
            this.f154773a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f154773a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f154773a.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    public e(Fragment fragment, NestedScrollView nestedScrollView, dx2.c cVar, Map<String, ? extends Object> map) {
        Map map2;
        sv2.c cVar2;
        String str;
        String str2;
        List<Map> list;
        ?? arrayList;
        sv2.c cVar3;
        fragment.getClass();
        nestedScrollView.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (j) (0 == true ? 1 : 0));
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        int iC = cx2.b.a.c(string);
        Object obj2 = map.get(i.WATCH_FACE_GRID_OPTIONS.f79975a);
        try {
            map2 = (Map) (obj2 instanceof Map ? obj2 : null);
        } catch (ClassCastException unused) {
            map2 = null;
        }
        if (map2 != null) {
            Object obj3 = map2.get(i.ICON_SET.f79975a);
            try {
                str = (String) (obj3 instanceof String ? obj3 : null);
            } catch (ClassCastException unused2) {
                str = null;
            }
            if (str == null) {
                cVar3 = null;
            } else {
                Object obj4 = map2.get(i.FRAME_IMAGE_NAME.f79975a);
                try {
                    str2 = (String) (obj4 instanceof String ? obj4 : null);
                } catch (ClassCastException unused3) {
                    str2 = null;
                }
                if (str2 == null) {
                    cVar3 = null;
                } else {
                    Object obj5 = map2.get(i.WATCH_FACE_GRID_ITEMS.f79975a);
                    try {
                        list = (List) (obj5 instanceof List ? obj5 : null);
                    } catch (ClassCastException unused4) {
                        list = null;
                    }
                    if (list != null) {
                        arrayList = new ArrayList(y.r(list, 10));
                        for (Map map3 : list) {
                            arrayList.add(new sv2.a(fb1.c.f(map3, i.INDEX.f79975a, cx2.b.f56665a), String.valueOf(map3.get(i.IMAGE_NAME.f79975a)), false, 4, null));
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                    cVar3 = new sv2.c(iC, str, str2, arrayList);
                }
            }
            cVar2 = cVar3;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            rv2.a aVar2 = new rv2.a(f0.w(fragment), cVar2.f161035a, cVar2.f161036b, cVar2.f161037c, nestedScrollView, cVar);
            this.f154772a.setAdapter(aVar2);
            j(cVar, map, null);
            aVar2.t(cVar2.f161038d);
            cVar.f61486c.f(fragment.getViewLifecycleOwner(), new a(new rp.b(cVar, 6, map, aVar2)));
        }
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(getContext(), R.layout.rts_watch_face_grid_view, this);
        View viewFindViewById = findViewById(R.id.watch_face_grid);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f154772a = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3, 1, false));
    }
}
