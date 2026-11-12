package com.xiaomi.fitness.devicesettings.utils;

import android.webkit.MimeTypeMap;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.wzi;
import defpackage.xc6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/MusicUtils;", "", "<init>", "()V", "parseType", "", "supportType", "", "isReturnType", "", "parse2Display", "originStr", "isReturnNull", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMusicUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicUtils.kt\ncom/xiaomi/fitness/devicesettings/utils/MusicUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1863#2,2:68\n*S KotlinDebug\n*F\n+ 1 MusicUtils.kt\ncom/xiaomi/fitness/devicesettings/utils/MusicUtils\n*L\n40#1:68,2\n*E\n"})
public final class MusicUtils {

    @NotNull
    public static final MusicUtils INSTANCE = new MusicUtils();

    private MusicUtils() {
    }

    public static /* synthetic */ String parse2Display$default(MusicUtils musicUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return musicUtils.parse2Display(str, z);
    }

    public static /* synthetic */ String parseType$default(MusicUtils musicUtils, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return musicUtils.parseType(i, z);
    }

    @Nullable
    public final String parse2Display(@Nullable String originStr, boolean isReturnNull) {
        if (originStr != null && !Intrinsics.areEqual(originStr, "<unknown>")) {
            return originStr;
        }
        if (isReturnNull) {
            return null;
        }
        return ResourceExtKt.getString(wzi.D5);
    }

    @Nullable
    public final String parseType(int supportType, boolean isReturnType) {
        ArrayList<String> arrayList = new ArrayList();
        if ((supportType & 1) != 0) {
            arrayList.add(MusicUtilsKt.sExtensionMp3);
        }
        if ((supportType & 2) != 0) {
            arrayList.add(MusicUtilsKt.sExtensionAac);
        }
        if ((supportType & 4) != 0) {
            arrayList.add(MusicUtilsKt.sExtensionWav);
        }
        if ((supportType & 8) != 0) {
            arrayList.add(MusicUtilsKt.sExtensionWma);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (isReturnType) {
            sb.append('(');
        }
        for (String str : arrayList) {
            if (isReturnType) {
                sb.append("'" + MimeTypeMap.getSingleton().getMimeTypeFromExtension(str) + "'");
                sb.append(",");
            } else {
                sb.append(str);
                sb.append(",");
            }
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        if (isReturnType) {
            sb.append(')');
        }
        xc6.d("parseType " + isReturnType + " " + ((Object) sb));
        return sb.toString();
    }
}
