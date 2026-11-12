package com.garmin.android.apps.connectmobile.badges.service.model;

import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/b;", "", "", TtmlNode.ATTR_ID, "nameResId", "sortOrder", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITIES(1, R.string.concept_activities, 4),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING(2, R.string.lbl_running, 2),
    /* JADX INFO: Fake field, exist only in values array */
    CYCLING(3, R.string.lbl_cycling, 3),
    /* JADX INFO: Fake field, exist only in values array */
    CHALLENGES(4, R.string.concept_challenges, 6),
    STEPS(5, R.string.steps_steps, 1),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_FEATURES(6, R.string.common_connect_features, 7),
    /* JADX INFO: Fake field, exist only in values array */
    HEALTH(7, R.string.choose_exp_health, 5),
    TACX_MULTI_STAGE(8, R.string.tacx_multi_stage, 8),
    /* JADX INFO: Fake field, exist only in values array */
    DIVING(9, R.string.lbl_diving, 9),
    /* JADX INFO: Fake field, exist only in values array */
    GOLF(10, R.string.lbl_golf, 10);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30552d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30558c;

    b(int i14, int i15, int i16) {
        this.f30556a = i14;
        this.f30557b = i15;
        this.f30558c = i16;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f30556a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/b$a;", "", "<init>", "()V", "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.service.model.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0485a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30559a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.TACX_MULTI_STAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f30559a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.badges.service.model.b$a$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0486b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(Integer.valueOf(((b) t7).f30558c), Integer.valueOf(((b) t14).f30558c));
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b[] a() {
            List listY = p13.u.Y(b.values(), new C0486b());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listY) {
                boolean zA = true;
                if (C0485a.f30559a[((b) obj).ordinal()] == 1) {
                    s3.f23252a.getClass();
                    zA = s3.a("ROLE_DI_TESTER");
                }
                if (zA) {
                    arrayList.add(obj);
                }
            }
            return (b[]) arrayList.toArray(new b[0]);
        }

        public static ArrayList b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((b) it.next()).f30556a));
            }
            return arrayList;
        }

        private a() {
        }
    }
}
