package com.huami.nfc.applet;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B)\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\u0082\u0001J\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]¨\u0006^"}, d2 = {"Lcom/huami/nfc/applet/BusCard;", "", "", "toString", "a", "Ljava/lang/String;", "getAppCode", "()Ljava/lang/String;", "appCode", "b", "getAid", "aid", "c", "getMiCardName", "miCardName", GoogleApiAvailabilityLight.a, "getName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/huami/nfc/applet/JiNanMot;", "Lcom/huami/nfc/applet/ShaoXingMotNew;", "Lcom/huami/nfc/applet/LntYctMot;", "Lcom/huami/nfc/applet/LntSztMot;", "Lcom/huami/nfc/applet/LntZhtMot;", "Lcom/huami/nfc/applet/LntZstMot;", "Lcom/huami/nfc/applet/LntDgtMot;", "Lcom/huami/nfc/applet/LntGftMot;", "Lcom/huami/nfc/applet/LntHztMot;", "Lcom/huami/nfc/applet/LntSttMot;", "Lcom/huami/nfc/applet/LntWytMot;", "Lcom/huami/nfc/applet/LntMctMot;", "Lcom/huami/nfc/applet/LntZqtMot;", "Lcom/huami/nfc/applet/LntZjtMot;", "Lcom/huami/nfc/applet/LntJytMot;", "Lcom/huami/nfc/applet/LntHhtMot;", "Lcom/huami/nfc/applet/LntHyyzfMot;", "Lcom/huami/nfc/applet/LntQysmkMot;", "Lcom/huami/nfc/applet/LntShaoZhouMot;", "Lcom/huami/nfc/applet/LntRJMot;", "Lcom/huami/nfc/applet/LntMJMot;", "Lcom/huami/nfc/applet/LntCZMot;", "Lcom/huami/nfc/applet/LntLYMot;", "Lcom/huami/nfc/applet/ShangHaiMot;", "Lcom/huami/nfc/applet/ZhenJiang;", "Lcom/huami/nfc/applet/YangZhou;", "Lcom/huami/nfc/applet/JsTaiZhou;", "Lcom/huami/nfc/applet/HuaiAn;", "Lcom/huami/nfc/applet/SuQian;", "Lcom/huami/nfc/applet/YanCheng;", "Lcom/huami/nfc/applet/XuZhou;", "Lcom/huami/nfc/applet/LianYunGang;", "Lcom/huami/nfc/applet/ShenZhenMot;", "Lcom/huami/nfc/applet/WeiFangMot;", "Lcom/huami/nfc/applet/ZhengZhouMot;", "Lcom/huami/nfc/applet/GanZhouMot;", "Lcom/huami/nfc/applet/ZhuHaiMot;", "Lcom/huami/nfc/applet/ChangSha;", "Lcom/huami/nfc/applet/YuLin;", "Lcom/huami/nfc/applet/HeBei;", "Lcom/huami/nfc/applet/NanJing;", "Lcom/huami/nfc/applet/XiZang;", "Lcom/huami/nfc/applet/ShaoXing;", "Lcom/huami/nfc/applet/WuXi;", "Lcom/huami/nfc/applet/ChangZhou;", "Lcom/huami/nfc/applet/ShiYan;", "Lcom/huami/nfc/applet/XiAnMot;", "Lcom/huami/nfc/applet/HeFeiMot;", "Lcom/huami/nfc/applet/TianJin;", "Lcom/huami/nfc/applet/ShiJiaZhuang;", "Lcom/huami/nfc/applet/ShenYang;", "Lcom/huami/nfc/applet/DaLian;", "Lcom/huami/nfc/applet/TaiZhou;", "Lcom/huami/nfc/applet/NingBo;", "Lcom/huami/nfc/applet/NanTong;", "Lcom/huami/nfc/applet/XiaMen;", "Lcom/huami/nfc/applet/QingDao;", "Lcom/huami/nfc/applet/HaiNan;", "Lcom/huami/nfc/applet/HaErBin;", "Lcom/huami/nfc/applet/ShangHai;", "Lcom/huami/nfc/applet/BeiJing;", "Lcom/huami/nfc/applet/XiAn;", "Lcom/huami/nfc/applet/HeFei;", "Lcom/huami/nfc/applet/ShenZhen;", "Lcom/huami/nfc/applet/JiLin;", "Lcom/huami/nfc/applet/SuZhou;", "Lcom/huami/nfc/applet/JiangSu;", "Lcom/huami/nfc/applet/WuHan;", "Lcom/huami/nfc/applet/ChongQing;", "Lcom/huami/nfc/applet/JingJinJi;", "Lcom/huami/nfc/applet/ZhengZhou;", "Lcom/huami/nfc/applet/GuangXi;", "Lcom/huami/nfc/applet/LingNanTong;", "Lcom/huami/nfc/applet/LingNanTongTwo;", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public abstract class BusCard {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String miCardName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    private BusCard(String str, String str2, String str3, String str4) {
        this.appCode = str;
        this.aid = str2;
        this.miCardName = str3;
        this.name = str4;
    }

    public /* synthetic */ BusCard(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getMiCardName() {
        return this.miCardName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public String toString() {
        return "BusCard(appCode='" + this.appCode + "', aid='" + this.aid + "', miCardName='" + this.miCardName + "', name='" + this.name + "')";
    }
}
