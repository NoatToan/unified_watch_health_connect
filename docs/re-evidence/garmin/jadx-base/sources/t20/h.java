package t20;

import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import java.io.File;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lt20/h;", "Lcom/garmin/android/library/backgroundtaskmanagement/a;", "Ls20/g;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends com.garmin.android.library.backgroundtaskmanagement.a implements s20.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f161777b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h f161778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static com.garmin.android.apps.connectmobile.courses.model.e f161779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List<com.garmin.android.apps.connectmobile.courses.model.e> f161780e;

    public /* synthetic */ h(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Override // s20.g
    public final com.garmin.android.apps.connectmobile.courses.model.e C() {
        if (f161779d == null) {
            return null;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar = f161779d;
        if (eVar == null) {
            eVar = new com.garmin.android.apps.connectmobile.courses.model.e();
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
        f161779d = null;
        return eVar2;
    }

    @Override // s20.g
    public final List<com.garmin.android.apps.connectmobile.courses.model.e> F() {
        List<com.garmin.android.apps.connectmobile.courses.model.e> list = f161780e;
        if (list == null) {
            return null;
        }
        f161780e = null;
        return list;
    }

    @Override // s20.g
    public final void G(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        f161779d = eVar != null ? new com.garmin.android.apps.connectmobile.courses.model.e(eVar) : null;
    }

    @Override // s20.g
    public final long c(String str, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.courses.model.e> interfaceC0995b) {
        str.getClass();
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new d(str, this), interfaceC0995b);
    }

    @Override // s20.g
    public final void o(List<com.garmin.android.apps.connectmobile.courses.model.e> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        f161780e = list;
    }

    @Override // s20.g
    public final long v(com.garmin.android.apps.connectmobile.courses.model.e eVar, g50.i iVar) {
        eVar.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new n(eVar, this), iVar);
    }

    @Override // s20.g
    public final void y(File file, String str, CourseTypeActivity.d dVar) {
        dVar.getClass();
        new j(file, str, dVar).b();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt20/h$a;", "", "<init>", "()V", "Lt20/h;", "sInstance", "Lt20/h;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "mCourseDetail", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "mCourseDetailList", "Ljava/util/List;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a() {
            p005kotlin.jvm.internal.j jVar = null;
            if (h.f161778c == null) {
                h.f161778c = new h(jVar);
            }
            h hVar = h.f161778c;
            if (hVar != null) {
                return hVar;
            }
            s.m("sInstance");
            throw null;
        }

        private a() {
        }
    }

    private h() {
    }
}
