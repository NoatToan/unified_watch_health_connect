package uh2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import hi2.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p13.h0;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Luh2/a;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "Lsh2/a;", "Lkotlin/collections/ArrayList;", "controlsMenuAPIList", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f171139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<ArrayList<sh2.a>> f171140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<ArrayList<Drawable>> f171141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<Boolean> f171142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f171143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sh2.b f171144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sh2.a f171145g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsh2/a;", "it", "", "invoke", "(Lsh2/a;)Ljava/lang/Comparable;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends w implements l<sh2.a, Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f171146a = new b();

        public b() {
            super(1);
        }

        @Override // e23.l
        public final Comparable<?> invoke(sh2.a aVar) {
            sh2.a aVar2 = aVar;
            aVar2.getClass();
            return aVar2.f159308b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsh2/a;", "it", "", "invoke", "(Lsh2/a;)Ljava/lang/Comparable;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends w implements l<sh2.a, Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f171147a = new c();

        public c() {
            super(1);
        }

        @Override // e23.l
        public final Comparable<?> invoke(sh2.a aVar) {
            sh2.a aVar2 = aVar;
            aVar2.getClass();
            return aVar2.f159310d;
        }
    }

    static {
        new C3189a(null);
    }

    public a(Context context, ArrayList<sh2.a> arrayList) {
        context.getClass();
        arrayList.getClass();
        this.f171139a = new d("ControlsMenuViewModel", null, 2, null);
        y0<ArrayList<sh2.a>> y0Var = new y0<>();
        this.f171140b = y0Var;
        y0<ArrayList<Drawable>> y0Var2 = new y0<>();
        this.f171141c = y0Var2;
        this.f171142d = new y0<>();
        sh2.b bVar = new sh2.b(context);
        this.f171144f = bVar;
        Boolean bool = Boolean.TRUE;
        String string = context.getString(R.string.social_available);
        string.getClass();
        this.f171145g = new sh2.a("AVAILABLE", 9630, bool, string, null);
        if (arrayList.isEmpty()) {
            h.z("No data");
            throw null;
        }
        y0Var.m(y4(bVar.a(arrayList)));
        y0Var2.m(x4());
    }

    public final ArrayList<Drawable> x4() {
        Drawable drawable;
        ArrayList<sh2.a> arrayListD = this.f171140b.d();
        if (arrayListD == null) {
            return null;
        }
        ArrayList<Drawable> arrayList = new ArrayList<>();
        for (sh2.a aVar : arrayListD) {
            Integer num = aVar.f159308b;
            if (num != null && num.intValue() <= 9630 && (drawable = aVar.f159311e) != null) {
                arrayList.add(drawable);
            }
        }
        Boolean bool = Boolean.FALSE;
        y0<Boolean> y0Var = this.f171142d;
        y0Var.m(bool);
        if (arrayList.size() <= 10) {
            return arrayList;
        }
        this.f171139a.a("Have more items on controls than watch face support");
        arrayList.add(5, null);
        List<Drawable> listSubList = arrayList.subList(arrayList.size() - 4, arrayList.size());
        listSubList.getClass();
        List<Drawable> listSubList2 = arrayList.subList(0, 5);
        listSubList2.getClass();
        ArrayList<Drawable> arrayList2 = new ArrayList<>();
        arrayList2.addAll(listSubList2);
        arrayList2.addAll(listSubList);
        y0Var.m(Boolean.TRUE);
        arrayList2.add(5, null);
        return arrayList2;
    }

    public final ArrayList<sh2.a> y4(ArrayList<sh2.a> arrayList) {
        this.f171143e = 0;
        List listN0 = h0.N0(arrayList, r13.a.a(b.f171146a, c.f171147a));
        ArrayList<sh2.a> arrayListD = this.f171140b.d();
        if (arrayListD == null) {
            arrayListD = new ArrayList<>();
        }
        arrayListD.clear();
        arrayListD.addAll(listN0);
        Iterator<T> it = arrayListD.iterator();
        while (it.hasNext()) {
            Integer num = ((sh2.a) it.next()).f159308b;
            if (num != null && num.intValue() < 9630) {
                this.f171143e++;
            }
        }
        sh2.a aVar = this.f171145g;
        arrayListD.remove(aVar);
        if (this.f171143e < arrayList.size()) {
            arrayListD.add(this.f171143e, aVar);
        }
        return arrayListD;
    }

    public final void z4(int i14, int i15) {
        ArrayList<sh2.a> arrayListD = this.f171140b.d();
        if (arrayListD != null) {
            if (i14 >= i15) {
                if (i15 <= i14) {
                    while (true) {
                        arrayListD.get(i14).f159308b = Integer.valueOf(i14);
                        if (i14 == i15) {
                            break;
                        } else {
                            i14--;
                        }
                    }
                }
            } else if (i14 <= i15) {
                while (true) {
                    arrayListD.get(i14).f159308b = Integer.valueOf(i14);
                    if (i14 == i15) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        this.f171141c.m(x4());
    }

    /* JADX INFO: renamed from: uh2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Luh2/a$a;", "", "<init>", "()V", "", "CIRCULAR_ANGLE", "I", "CONTROLS_LABEL_POSITION", "CONTROLS_UNSELECTED_POSITION", "CROWN_OFFSET_WATCH_FACE", "ICON_PADDING_FROM_WATCH_FACE_CENTER", "ICON_PADDING_IN_PIXEL", "IMAGE_VIEW_ICON_PADDING", "POSITION_HIDER", "WATCH_FACE_ICONS_COUNT", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C3189a {
        public /* synthetic */ C3189a(j jVar) {
            this();
        }

        private C3189a() {
        }
    }
}
