package com.huami.prelaunch.elements;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.prelaunch.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ONYX_BIND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/huami/prelaunch/elements/Picture;", "", "", "getPicTag", "configName", "Ljava/lang/String;", "getConfigName", "()Ljava/lang/String;", "elementName", "getElementName", "", "defaultPic", LogUtil.I, "getDefaultPic", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "ONYX_BIND", "ONYX_WATCH_SKIN", "CORSICA_BIND", "CORSICA_WATCH_SKIN", "OSPREY_BIND", "OSPREY_WATCH_SKIN", "prelaunch_release"}, k = 1, mv = {1, 4, 0})
public final class Picture {
    private static final /* synthetic */ Picture[] $VALUES;
    public static final Picture CORSICA_BIND;
    public static final Picture CORSICA_WATCH_SKIN;
    public static final Picture ONYX_BIND;
    public static final Picture ONYX_WATCH_SKIN;
    public static final Picture OSPREY_BIND;
    public static final Picture OSPREY_WATCH_SKIN;

    @NotNull
    private final String configName;
    private final int defaultPic;

    @NotNull
    private final String elementName;

    static {
        int i = R.drawable.img_gtr;
        Picture picture = new Picture("ONYX_BIND", 0, "onyx", "bindPic", i);
        ONYX_BIND = picture;
        int i2 = R.drawable.img_hawk_dial_bg;
        Picture picture2 = new Picture("ONYX_WATCH_SKIN", 1, "onyx", "watchSkinPic", i2);
        ONYX_WATCH_SKIN = picture2;
        Picture picture3 = new Picture("CORSICA_BIND", 2, "corsica", "bindPic", i);
        CORSICA_BIND = picture3;
        Picture picture4 = new Picture("CORSICA_WATCH_SKIN", 3, "corsica", "watchSkinPic", i2);
        CORSICA_WATCH_SKIN = picture4;
        Picture picture5 = new Picture("OSPREY_BIND", 4, "osprey", "bindPic", i);
        OSPREY_BIND = picture5;
        Picture picture6 = new Picture("OSPREY_WATCH_SKIN", 5, "osprey", "watchSkinPic", i2);
        OSPREY_WATCH_SKIN = picture6;
        $VALUES = new Picture[]{picture, picture2, picture3, picture4, picture5, picture6};
    }

    private Picture(String str, int i, String str2, String str3, int i2) {
        super(str, i);
        this.configName = str2;
        this.elementName = str3;
        this.defaultPic = i2;
    }

    public static Picture valueOf(String str) {
        return (Picture) Enum.valueOf(Picture.class, str);
    }

    public static Picture[] values() {
        return (Picture[]) $VALUES.clone();
    }

    @NotNull
    public final String getConfigName() {
        return this.configName;
    }

    public final int getDefaultPic() {
        return this.defaultPic;
    }

    @NotNull
    public final String getElementName() {
        return this.elementName;
    }

    @NotNull
    public final String getPicTag() {
        return "PICTURE_" + name();
    }
}
