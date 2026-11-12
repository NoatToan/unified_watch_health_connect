package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/u;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum u {
    UNKNOWN(-1),
    WEEK(0),
    MONTH(1),
    CUSTOM(2),
    WEEKEND(3),
    ONE_DAY(4);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38346b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38354a;

    u(int i14) {
        this.f38354a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/u$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.model.u$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0677a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38355a;

            static {
                int[] iArr = new int[u.values().length];
                try {
                    iArr[u.WEEKEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u.WEEK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[u.ONE_DAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[u.MONTH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[u.CUSTOM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f38355a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(u uVar, Context context) {
            int i14 = C0677a.f38355a[uVar.ordinal()];
            if (i14 == 1) {
                String string = context.getString(R.string.common_weekend);
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                String string2 = context.getString(R.string.menu_option_week);
                string2.getClass();
                return string2;
            }
            if (i14 == 3) {
                String string3 = context.getString(R.string.menu_option_daily);
                string3.getClass();
                return string3;
            }
            if (i14 == 4) {
                String string4 = context.getString(R.string.menu_option_month);
                string4.getClass();
                return string4;
            }
            if (i14 != 5) {
                return "";
            }
            String string5 = context.getString(R.string.lbl_custom);
            string5.getClass();
            return string5;
        }

        public static u b(int i14) {
            u uVar = u.WEEKEND;
            if (i14 == uVar.f38354a) {
                return uVar;
            }
            u uVar2 = u.WEEK;
            if (i14 == uVar2.f38354a) {
                return uVar2;
            }
            u uVar3 = u.ONE_DAY;
            if (i14 == uVar3.f38354a) {
                return uVar3;
            }
            u uVar4 = u.MONTH;
            if (i14 == uVar4.f38354a) {
                return uVar4;
            }
            u uVar5 = u.CUSTOM;
            return i14 == uVar5.f38354a ? uVar5 : u.UNKNOWN;
        }

        private a() {
        }
    }
}
