package jm0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import java.util.ArrayList;
import qm0.x;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99564b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.group.details.b.a.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.group.details.b.a.f36271d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.group.details.b.a.f36272e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.group.details.b.a.f36273f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.group.details.b.a.f36274g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f99563a = iArr;
            int[] iArr2 = new int[x.b.values().length];
            try {
                iArr2[x.b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x.b.ACTIVITY_FEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x.b.POST_FEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f99564b = iArr2;
        }
    }

    public static final void a(e23.a aVar, Context context) {
        new androidx.appcompat.app.e.a(context).setTitle(R.string.external_links_warning_title).setPositiveButton(R.string.lbl_yes, new c32.a(aVar, 5)).setNegativeButton(R.string.lbl_no, new c(1)).setMessage(R.string.external_links_warning_message).show();
    }

    public static final boolean b(GroupDetailsDTO groupDetailsDTO) {
        ArrayList arrayList;
        return (groupDetailsDTO == null || (arrayList = groupDetailsDTO.f31575r) == null || !(arrayList.isEmpty() ^ true)) ? false : true;
    }
}
