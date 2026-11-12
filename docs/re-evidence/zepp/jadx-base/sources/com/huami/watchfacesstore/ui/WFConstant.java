package com.huami.watchfacesstore.ui;

import android.graphics.Color;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watchfacesstore.ext.KoinExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watchfacesstore/ui/WFConstant;", "", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WFConstant {

    @NotNull
    public static final String DATABASE_NAME = "watch-face";
    public static final int IS_FROM_CATEGORY = 5;
    public static final int IS_FROM_COLLECT = 4;
    public static final int IS_FROM_COOL_SPECIAL = 9;
    public static final int IS_FROM_DEVICE_DELETE = 7;
    public static final int IS_FROM_HISTORY = 10;
    public static final int IS_FROM_LOCAL = 1;
    public static final int IS_FROM_LOCAL_WATCH = 6;
    public static final int IS_FROM_NEW_WATCH = 3;
    public static final int IS_FROM_ONLINE = 0;
    public static final int IS_FROM_OUTSIDE = 2;
    public static final int IS_FROM_WATCH_PUBLISHER = 8;
    public static final int ITEM_NORMAL = 0;
    public static final int ITEM_SELECTED = 2;
    public static final int ITEM_UN_SELECT = 1;

    @NotNull
    public static final String RANK_TYPE_TOTAL = "total";

    @NotNull
    public static final String RANK_TYPE_WEEK = "week";

    @NotNull
    public static final String WF_TAG = "WatchFaceLog";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = KoinExtKt.getAppContext().getPackageName() + ".wfFileProvider";

    @NotNull
    private static final List<Integer> b = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Color.parseColor("#FFFFFF")), Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#00BCD4")), Integer.valueOf(Color.parseColor("#2196F3")), Integer.valueOf(Color.parseColor("#9575CD")), Integer.valueOf(Color.parseColor("#BA68C8")), Integer.valueOf(Color.parseColor("#EF5250")), Integer.valueOf(Color.parseColor("#FF9800")), Integer.valueOf(Color.parseColor("#FFC107")), Integer.valueOf(Color.parseColor("#C0CA33")), Integer.valueOf(Color.parseColor("#4CAF50")), Integer.valueOf(Color.parseColor("#FFFF00"))});

    @NotNull
    private static final List<Integer> c = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Color.parseColor("#B2EBF2")), Integer.valueOf(Color.parseColor("#BBDEFB")), Integer.valueOf(Color.parseColor("#D1C4E9")), Integer.valueOf(Color.parseColor("#E1BEE7")), Integer.valueOf(Color.parseColor("#F8BBD0")), Integer.valueOf(Color.parseColor("#FFCED2")), Integer.valueOf(Color.parseColor("#FFCCBC")), Integer.valueOf(Color.parseColor("#FFE0B2")), Integer.valueOf(Color.parseColor("#FFECB3")), Integer.valueOf(Color.parseColor("#FFF9C4")), Integer.valueOf(Color.parseColor("#F0F4C3")), Integer.valueOf(Color.parseColor("#C8E6C9")), Integer.valueOf(Color.parseColor("#FFFFFF")), Integer.valueOf(Color.parseColor("#80DEEA")), Integer.valueOf(Color.parseColor("#90CAF9")), Integer.valueOf(Color.parseColor("#B39DDB")), Integer.valueOf(Color.parseColor("#CE93D8")), Integer.valueOf(Color.parseColor("#F48FB1")), Integer.valueOf(Color.parseColor("#EF9A9A")), Integer.valueOf(Color.parseColor("#FFAB91")), Integer.valueOf(Color.parseColor("#FFCC80")), Integer.valueOf(Color.parseColor("#FFE082")), Integer.valueOf(Color.parseColor("#FFF59D")), Integer.valueOf(Color.parseColor("#E6EE9C")), Integer.valueOf(Color.parseColor("#A5D6A7")), Integer.valueOf(Color.parseColor("#EBEBEB")), Integer.valueOf(Color.parseColor("#4CD0E1")), Integer.valueOf(Color.parseColor("#64B5F6")), Integer.valueOf(Color.parseColor("#9575CD")), Integer.valueOf(Color.parseColor("#BA68C8")), Integer.valueOf(Color.parseColor("#F06292")), Integer.valueOf(Color.parseColor("#E57373")), Integer.valueOf(Color.parseColor("#FF8965")), Integer.valueOf(Color.parseColor("#FFB74D")), Integer.valueOf(Color.parseColor("#FFD54F")), Integer.valueOf(Color.parseColor("#FFF175")), Integer.valueOf(Color.parseColor("#DCE775")), Integer.valueOf(Color.parseColor("#81C784")), Integer.valueOf(Color.parseColor("#D6D6D6")), Integer.valueOf(Color.parseColor("#26C6DA")), Integer.valueOf(Color.parseColor("#42A5F5")), Integer.valueOf(Color.parseColor("#7E57C2")), Integer.valueOf(Color.parseColor("#AB47BC")), Integer.valueOf(Color.parseColor("#EC3F7A")), Integer.valueOf(Color.parseColor("#E44849")), Integer.valueOf(Color.parseColor("#FF7042")), Integer.valueOf(Color.parseColor("#FFA726")), Integer.valueOf(Color.parseColor("#FFCA28")), Integer.valueOf(Color.parseColor("#FFEE58")), Integer.valueOf(Color.parseColor("#D4E157")), Integer.valueOf(Color.parseColor("#66BB69")), Integer.valueOf(Color.parseColor("#C2C2C2")), Integer.valueOf(Color.parseColor("#00BCD4")), Integer.valueOf(Color.parseColor("#2196F3")), Integer.valueOf(Color.parseColor("#673AB7")), Integer.valueOf(Color.parseColor("#9C27B0")), Integer.valueOf(Color.parseColor("#E91E63")), Integer.valueOf(Color.parseColor("#F44336")), Integer.valueOf(Color.parseColor("#FF5721")), Integer.valueOf(Color.parseColor("#FF9800")), Integer.valueOf(Color.parseColor("#FFC107")), Integer.valueOf(Color.parseColor("#FFEB3A")), Integer.valueOf(Color.parseColor("#CDDC39")), Integer.valueOf(Color.parseColor("#4CAF50")), Integer.valueOf(Color.parseColor("#999999")), Integer.valueOf(Color.parseColor("#00ACC1")), Integer.valueOf(Color.parseColor("#1D88E5")), Integer.valueOf(Color.parseColor("#5E35B1")), Integer.valueOf(Color.parseColor("#8D24AA")), Integer.valueOf(Color.parseColor("#D81B60")), Integer.valueOf(Color.parseColor("#E53835")), Integer.valueOf(Color.parseColor("#F4511D")), Integer.valueOf(Color.parseColor("#FB8C00")), Integer.valueOf(Color.parseColor("#FFB301")), Integer.valueOf(Color.parseColor("#FDD835")), Integer.valueOf(Color.parseColor("#C0CA33")), Integer.valueOf(Color.parseColor("#43A046")), Integer.valueOf(Color.parseColor("#707070")), Integer.valueOf(Color.parseColor("#0097A7")), Integer.valueOf(Color.parseColor("#1876D2")), Integer.valueOf(Color.parseColor("#502DA8")), Integer.valueOf(Color.parseColor("#7B1FA2")), Integer.valueOf(Color.parseColor("#C2185B")), Integer.valueOf(Color.parseColor("#D32F2F")), Integer.valueOf(Color.parseColor("#E64A18")), Integer.valueOf(Color.parseColor("#F57C00")), Integer.valueOf(Color.parseColor("#FFA001")), Integer.valueOf(Color.parseColor("#FBC02D")), Integer.valueOf(Color.parseColor("#AFB42B")), Integer.valueOf(Color.parseColor("#388E3C")), Integer.valueOf(Color.parseColor("#474747")), Integer.valueOf(Color.parseColor("#00838F")), Integer.valueOf(Color.parseColor("#1565C0")), Integer.valueOf(Color.parseColor("#4426A0")), Integer.valueOf(Color.parseColor("#6A1A9A")), Integer.valueOf(Color.parseColor("#AD1457")), Integer.valueOf(Color.parseColor("#C62828")), Integer.valueOf(Color.parseColor("#D84315")), Integer.valueOf(Color.parseColor("#EF6C00")), Integer.valueOf(Color.parseColor("#FE8F00")), Integer.valueOf(Color.parseColor("#F9A825")), Integer.valueOf(Color.parseColor("#9E9D24")), Integer.valueOf(Color.parseColor("#2E7D32")), Integer.valueOf(Color.parseColor("#333333")), Integer.valueOf(Color.parseColor("#006064")), Integer.valueOf(Color.parseColor("#0C479F")), Integer.valueOf(Color.parseColor("#311A92")), Integer.valueOf(Color.parseColor("#4A138C")), Integer.valueOf(Color.parseColor("#880E4F")), Integer.valueOf(Color.parseColor("#B71B1D")), Integer.valueOf(Color.parseColor("#BF360C")), Integer.valueOf(Color.parseColor("#E65100")), Integer.valueOf(Color.parseColor("#FF6F00")), Integer.valueOf(Color.parseColor("#F57F17")), Integer.valueOf(Color.parseColor("#827717")), Integer.valueOf(Color.parseColor("#1B5E1F")), Integer.valueOf(Color.parseColor("#000000"))});

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004¨\u0006$"}, d2 = {"Lcom/huami/watchfacesstore/ui/WFConstant$Companion;", "", "", "FILE_PROVIDER_AUTH", "Ljava/lang/String;", "getFILE_PROVIDER_AUTH", "()Ljava/lang/String;", "", "", "colorLists", "Ljava/util/List;", "getColorLists", "()Ljava/util/List;", "moreColorLists", "getMoreColorLists", "DATABASE_NAME", "IS_FROM_CATEGORY", LogUtil.I, "IS_FROM_COLLECT", "IS_FROM_COOL_SPECIAL", "IS_FROM_DEVICE_DELETE", "IS_FROM_HISTORY", "IS_FROM_LOCAL", "IS_FROM_LOCAL_WATCH", "IS_FROM_NEW_WATCH", "IS_FROM_ONLINE", "IS_FROM_OUTSIDE", "IS_FROM_WATCH_PUBLISHER", "ITEM_NORMAL", "ITEM_SELECTED", "ITEM_UN_SELECT", "RANK_TYPE_TOTAL", "RANK_TYPE_WEEK", "WF_TAG", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Integer> getColorLists() {
            return WFConstant.b;
        }

        @NotNull
        public final String getFILE_PROVIDER_AUTH() {
            return WFConstant.a;
        }

        @NotNull
        public final List<Integer> getMoreColorLists() {
            return WFConstant.c;
        }
    }
}
