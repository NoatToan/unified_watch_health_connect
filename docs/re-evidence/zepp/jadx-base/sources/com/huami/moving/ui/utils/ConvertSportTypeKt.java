package com.huami.moving.ui.utils;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"", "convertSportType", "moving_release"}, k = 2, mv = {1, 5, 1})
public final class ConvertSportTypeKt {
    public static final int convertSportType(int i) {
        return SportTypeIdentifier.isSubSport(i) ? i - 1000 : i;
    }
}
