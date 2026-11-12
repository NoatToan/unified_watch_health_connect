package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.text.TextUtils;
import bs2.qs;
import bs2.ve;
import com.garmin.proto.generated.GDISwingSensorClubs;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve f35891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs f35893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f35894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f35895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f35896h;

    public a(long j8, long j14, int i14, String str, int i15, float f14, float f15, float f16) {
        this.f35889a = j8;
        this.f35890b = j14;
        this.f35891c = ve.a(Short.valueOf((short) i14));
        this.f35892d = str;
        this.f35893e = qs.a(Short.valueOf((short) i15));
        this.f35894f = f14;
        this.f35895g = f15;
        this.f35896h = f16;
    }

    public final String a() {
        String str = this.f35892d;
        return TextUtils.isEmpty(str) ? wl0.h.i().j(this.f35891c.f20622a) : str;
    }

    public a(GDISwingSensorClubs.Club club) {
        this(club.getTimestamp(), club.getClubId(), club.getClubType(), club.getClubNickname(), club.getShaftFlex(), club.getLengthOffset(), club.getClubLoft(), club.getClubLie());
    }
}
