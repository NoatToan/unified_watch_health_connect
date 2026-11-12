package v40;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.u0;
import k30.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import x40.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv40/d;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f175552h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f175553g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175554a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.POPULARITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.FOLLOW_ROADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIN_ASCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.FREE_FLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.FREEHAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f175554a = iArr;
        }
    }

    public d() {
        super(R.layout.course_demands_content, false, true, 0, 10, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        k kVar;
        i iVar;
        Object serializable;
        Object serializable2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            kVar = k.POPULARITY;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments.getSerializable("routingType", k.class);
            } else {
                Object serializable3 = arguments.getSerializable("routingType");
                if (!(serializable3 instanceof k)) {
                    serializable3 = null;
                }
                serializable2 = (k) serializable3;
            }
            kVar = (k) serializable2;
            if (kVar == null) {
                kVar = k.POPULARITY;
            }
        }
        k kVar2 = kVar;
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            iVar = i.ROAD_CYCLING;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments2.getSerializable("courseType", i.class);
            } else {
                Object serializable4 = arguments2.getSerializable("courseType");
                serializable = (i) (serializable4 instanceof i ? serializable4 : null);
            }
            iVar = (i) serializable;
            if (iVar == null) {
                iVar = i.ROAD_CYCLING;
            }
        }
        i iVar2 = iVar;
        Bundle arguments3 = getArguments();
        boolean z14 = arguments3 != null ? arguments3.getBoolean("avoidHighTraffic", false) : false;
        Bundle arguments4 = getArguments();
        boolean z15 = arguments4 != null ? arguments4.getBoolean("avoidClosedRoads", false) : false;
        Bundle arguments5 = getArguments();
        boolean z16 = arguments5 != null ? arguments5.getBoolean("avoidUnpavedRoads", false) : false;
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.course_demands_container);
        if (composeView != null) {
            composeView.setContent(new z3.e(488146526, true, new v40.b(kVar2, z14, z15, z16, iVar2, this, 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.lbl_course_options);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lv40/d$a;", "", "<init>", "()V", "", "EXTRA_ROUTING_TYPE", "Ljava/lang/String;", "EXTRA_COURSE_TYPE", "EXTRA_AVOID_HIGH_TRAFFIC", "EXTRA_AVOID_CLOSED_ROADS", "EXTRA_AVOID_UNPAVED_ROADS", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
