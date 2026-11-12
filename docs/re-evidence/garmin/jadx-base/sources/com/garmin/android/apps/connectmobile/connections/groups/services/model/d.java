package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import java.util.Comparator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/d;", "Ljava/util/Comparator;", "Lj10/d;", "Lkotlin/Comparator;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements Comparator<j10.d> {
    @Override // java.util.Comparator
    public final int compare(j10.d dVar, j10.d dVar2) {
        j10.d dVar3 = dVar;
        j10.d dVar4 = dVar2;
        dVar3.getClass();
        dVar4.getClass();
        return s.h(dVar3.ordinal(), dVar4.ordinal());
    }
}
