package com.garmin.android.apps.connectmobile.leaderboard.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/g0;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g0 {
    DEFAULT(0),
    GUARDIAN(1),
    KID(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38162b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38167a;

    g0(int i14) {
        this.f38167a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/g0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g0 a(Integer num) {
            g0 g0Var;
            if (num != null) {
                g0[] g0VarArrValues = g0.values();
                int length = g0VarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        g0Var = null;
                        break;
                    }
                    g0Var = g0VarArrValues[i14];
                    if (g0Var.f38167a == num.intValue()) {
                        break;
                    }
                    i14++;
                }
                if (g0Var != null) {
                    return g0Var;
                }
            }
            return g0.DEFAULT;
        }

        private a() {
        }
    }
}
