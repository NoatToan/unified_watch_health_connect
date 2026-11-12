package com.xiaomi.fit.fitness.export.data.item;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"getViewPager", "", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "getCover", "getArcInfo", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SwitchSongItemKt {
    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @NotNull
    public static final String getArcInfo(@NotNull SwitchSongItem switchSongItem) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(switchSongItem, "<this>");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[1];
        String songName = switchSongItem.getSongName();
        if (songName != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            lowerCase = songName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        objArr[0] = lowerCase;
        String str = String.format("assets/mapsconf/%s.json", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @NotNull
    public static final String getCover(@NotNull SwitchSongItem switchSongItem) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(switchSongItem, "<this>");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[1];
        String songName = switchSongItem.getSongName();
        if (songName != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            lowerCase = songName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        objArr[0] = lowerCase;
        String str = String.format("https://jd.ubicdn.com/assets/maps/%s/cover_phone.jpg", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @NotNull
    public static final String getViewPager(@NotNull SwitchSongItem switchSongItem) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(switchSongItem, "<this>");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[1];
        String songName = switchSongItem.getSongName();
        if (songName != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            lowerCase = songName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        objArr[0] = lowerCase;
        String str = String.format("https://jd.ubicdn.com/assets/maps/%s/cover.jpg", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
