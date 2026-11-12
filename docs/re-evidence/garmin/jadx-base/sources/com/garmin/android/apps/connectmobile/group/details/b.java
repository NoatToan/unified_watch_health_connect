package com.garmin.android.apps.connectmobile.group.details;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import java.util.ArrayList;
import jm0.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qm0.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/b;", "Lhe/a;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "groupDetailsDTO", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends he.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fragment f36266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f36267k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment, GroupDetailsDTO groupDetailsDTO) {
        ArrayList arrayList;
        super(fragment);
        fragment.getClass();
        this.f36266j = fragment;
        if (d.b(groupDetailsDTO)) {
            a.f36268a.getClass();
            arrayList = a.f36269b;
        } else {
            a.f36268a.getClass();
            arrayList = a.f36270c;
        }
        this.f36267k = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f36267k.size();
    }

    @Override // he.a
    public final Fragment u(int i14) {
        return ((a) this.f36267k.get(i14)).b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f36268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ArrayList f36269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ArrayList f36270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0636b f36271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f36272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f36273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C0635a f36274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a[] f36275h;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/group/details/GroupTabsPagerAdapter.GroupTabItems.About", "Lcom/garmin/android/apps/connectmobile/group/details/b$a;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0635a extends a {
            public C0635a(String str, int i14) {
                super(str, i14, null);
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final String a(Context context) {
                String string = context.getString(R.string.lbl_about);
                string.getClass();
                return string;
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final Fragment b() {
                return new nm0.e();
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/group/details/GroupTabsPagerAdapter.GroupTabItems.ActivityFeed", "Lcom/garmin/android/apps/connectmobile/group/details/b$a;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0636b extends a {
            public C0636b(String str, int i14) {
                super(str, i14, null);
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final String a(Context context) {
                String string = context.getString(R.string.social_group_feed);
                string.getClass();
                return string;
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final Fragment b() {
                return new x();
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/group/details/GroupTabsPagerAdapter.GroupTabItems.Challenges", "Lcom/garmin/android/apps/connectmobile/group/details/b$a;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {
            public c(String str, int i14) {
                super(str, i14, null);
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final String a(Context context) {
                String string = context.getString(R.string.concept_challenges_abbr);
                string.getClass();
                return string;
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final Fragment b() {
                return new com.garmin.android.apps.connectmobile.group.details.challenges.e();
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/group/details/GroupTabsPagerAdapter.GroupTabItems.LeaderBoard", "Lcom/garmin/android/apps/connectmobile/group/details/b$a;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends a {
            public e(String str, int i14) {
                super(str, i14, null);
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final String a(Context context) {
                String string = context.getString(R.string.concept_leaderboard);
                string.getClass();
                return string;
            }

            @Override // com.garmin.android.apps.connectmobile.group.details.b.a
            public final Fragment b() {
                return new xm0.c();
            }
        }

        static {
            C0636b c0636b = new C0636b("ActivityFeed", 0);
            f36271d = c0636b;
            c cVar = new c("Challenges", 1);
            f36272e = cVar;
            e eVar = new e("LeaderBoard", 2);
            f36273f = eVar;
            C0635a c0635a = new C0635a("About", 3);
            f36274g = c0635a;
            f36275h = new a[]{c0636b, cVar, eVar, c0635a};
            f36268a = new d(null);
            f36269b = p13.x.m(c0636b, cVar, eVar, c0635a);
            f36270c = p13.x.m(c0636b, cVar, c0635a);
        }

        public /* synthetic */ a(String str, int i14, j jVar) {
            this(str, i14);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36275h.clone();
        }

        public abstract String a(Context context);

        public abstract Fragment b();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/b$a$d;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d {
            public /* synthetic */ d(j jVar) {
                this();
            }

            private d() {
            }
        }

        private a(String str, int i14) {
            super(str, i14);
        }
    }
}
