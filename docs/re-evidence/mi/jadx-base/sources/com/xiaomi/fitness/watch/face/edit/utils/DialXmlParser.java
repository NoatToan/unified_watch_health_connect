package com.xiaomi.fitness.watch.face.edit.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Xml;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.watch.face.edit.entity.CustomWidget;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemArcProgressBar;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemImageNumber;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemImageValues;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemLineProgressBar;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemPointer;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemText;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.EditWidget;
import com.xiaomi.fitness.watch.face.edit.entity.Image;
import com.xiaomi.fitness.watch.face.edit.entity.ImageArray;
import com.xiaomi.fitness.watch.face.edit.entity.ImageArrayWrapper;
import com.xiaomi.fitness.watch.face.edit.entity.ImageWrapper;
import com.xiaomi.fitness.watch.face.edit.entity.LanguageItem;
import com.xiaomi.fitness.watch.face.edit.entity.Layout;
import com.xiaomi.fitness.watch.face.edit.entity.Param;
import com.xiaomi.fitness.watch.face.edit.entity.ResourceFile;
import com.xiaomi.fitness.watch.face.edit.entity.Slot;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.entity.SlotPosition;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import com.xiaomi.fitness.watch.face.edit.entity.SlotWidgetItem;
import com.xiaomi.fitness.watch.face.edit.entity.Sprite;
import com.xiaomi.fitness.watch.face.edit.entity.TextContent;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.entity.Translation;
import com.xiaomi.fitness.watch.face.edit.entity.WidgetItem;
import com.xiaomi.fitness.watch.face.edit.slot.pick.FaceEditSlotNameHelper;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import com.xiaomi.smarthome.setting.ServerSetting;
import defpackage.gv5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010/\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00104\u001a\u0002032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00105\u001a\u0002062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u00107\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u00109\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010>\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010?\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010@\u001a\u0004\u0018\u00010\u00052\b\u0010A\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010G\u001a\u00020H2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010K\u001a\u00020J2\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0019H\u0002J\"\u0010N\u001a\u0004\u0018\u00010\u0005*\u00020\u000b2\u0006\u0010M\u001a\u00020\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010P\u001a\u00020,*\u00020\u000b2\u0006\u0010Q\u001a\u00020\u00052\b\b\u0002\u0010R\u001a\u00020,H\u0002J\u001e\u0010S\u001a\u00020T*\u00020\u000b2\u0006\u0010Q\u001a\u00020\u00052\b\b\u0002\u0010R\u001a\u00020TH\u0002J\u001e\u0010U\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010Q\u001a\u00020\u00052\b\b\u0002\u0010R\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/utils/DialXmlParser;", "", "<init>", "()V", "TAG", "", "parseDialXml", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "filePath", "readXmlDetail", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "path", "readTheme", "", "dialWatchFace", "checkColorTableAllEffective", "", "colorList", "", "getSlotEditWidgetList", "Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;", "slot", "Lcom/xiaomi/fitness/watch/face/edit/entity/Slot;", "resourceMap", "", "readLayoutList", "Lcom/xiaomi/fitness/watch/face/edit/entity/Layout;", "readLayout", "readWatchFace", "skip", "readResourceMap", "readSprite", "Lcom/xiaomi/fitness/watch/face/edit/entity/Sprite;", "readDataItemText", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemText;", "readDataItemLineProgressBar", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemLineProgressBar;", "readDataItemArcProgressBar", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemArcProgressBar;", "readSlot", "readCustomWidget", "Lcom/xiaomi/fitness/watch/face/edit/entity/CustomWidget;", "getAlignGap", "", "readWidgetItemList", "Lcom/xiaomi/fitness/watch/face/edit/entity/WidgetItem;", "readWidgetItem", "readDataItemImageValues", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageValues;", "readParamList", "Lcom/xiaomi/fitness/watch/face/edit/entity/Param;", "readParam", "readDataItemPointer", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemPointer;", "checkUesSourceEnable", "value", "getSourceValueOrNumberValue", "readImageArray", "Lcom/xiaomi/fitness/watch/face/edit/entity/ImageArray;", "readDataItemImageNumber", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageNumber;", "getRefString", "getRefExtString", "removeStartIfNeed", "ref", "readImage", "Lcom/xiaomi/fitness/watch/face/edit/entity/Image;", "readImageList", "readLuaFile", "Lcom/xiaomi/fitness/watch/face/edit/entity/ResourceFile;", "readTranslation", "Lcom/xiaomi/fitness/watch/face/edit/entity/Translation;", "readLanguageList", "Lcom/xiaomi/fitness/watch/face/edit/entity/LanguageItem;", "readTranslationItem", "findXmlTranslation", "name", "keyValue", "nameSpace", "safeFloatValueParse", "str", "default", "safeIntValueParse", "", "safeBooleanValueParse", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialXmlParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialXmlParser.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialXmlParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,867:1\n1863#2:868\n1864#2:870\n1863#2,2:871\n1863#2:873\n1863#2,2:874\n1864#2:876\n1863#2,2:877\n1863#2,2:879\n1#3:869\n*S KotlinDebug\n*F\n+ 1 DialXmlParser.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialXmlParser\n*L\n109#1:868\n109#1:870\n176#1:871,2\n196#1:873\n200#1:874,2\n196#1:876\n246#1:877,2\n254#1:879,2\n*E\n"})
public final class DialXmlParser {

    @NotNull
    public static final DialXmlParser INSTANCE = new DialXmlParser();

    @NotNull
    private static final String TAG = "DialXmlParser";

    private DialXmlParser() {
    }

    private final boolean checkUesSourceEnable(String value) {
        Float fValueOf;
        if (value == null) {
            return false;
        }
        try {
            fValueOf = Float.valueOf(Float.parseFloat(value));
        } catch (Exception unused) {
            fValueOf = null;
        }
        return fValueOf == null;
    }

    private final String findXmlTranslation(String name, Map<String, ? extends Object> resourceMap) {
        Object next;
        if (!StringsKt__StringsJVMKt.startsWith$default(name, gv5.CONNECT_VALUE_STR, false, 2, null)) {
            String string = ApplicationExtKt.getApplication().getString(FaceEditSlotNameHelper.INSTANCE.getSlotName(name));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 2, null);
        Object obj = resourceMap.get(removeStartIfNeed(name));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.edit.entity.Translation");
        Translation translation = (Translation) obj;
        Iterator<T> it = translation.getLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((LanguageItem) next).getLanguage(), currentLocale$default));
        LanguageItem languageItem = (LanguageItem) next;
        String str = languageItem != null ? languageItem.getStr() : null;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = translation.getLanguageList().get(0).getStr();
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }

    private final float getAlignGap(XmlPullParser parser) {
        String strKeyValue$default = keyValue$default(this, parser, "gap", null, 2, null);
        return (strKeyValue$default == null || StringsKt__StringsKt.isBlank(strKeyValue$default)) ? safeFloatValueParse$default(this, parser, "_space", 0.0f, 2, null) : safeFloatValueParse$default(this, parser, "gap", 0.0f, 2, null);
    }

    private final String getRefExtString(XmlPullParser parser) {
        return removeStartIfNeed(keyValue$default(this, parser, "refExt", null, 2, null));
    }

    private final String getRefString(XmlPullParser parser) {
        return removeStartIfNeed(keyValue$default(this, parser, "ref", null, 2, null));
    }

    private final List<EditWidget> getSlotEditWidgetList(Slot slot, Map<String, ? extends Object> resourceMap) {
        ArrayList arrayList = new ArrayList();
        List<SlotWidgetItem> itemList = slot.getItemList();
        if (itemList != null) {
            Iterator<T> it = itemList.iterator();
            while (it.hasNext()) {
                Object obj = resourceMap.get(((SlotWidgetItem) it.next()).getRef());
                if (obj instanceof CustomWidget) {
                    CustomWidget customWidget = (CustomWidget) obj;
                    String name = customWidget.getName();
                    if (name == null) {
                        name = "";
                    }
                    String widgetName = customWidget.getWidgetName();
                    if (widgetName == null) {
                        widgetName = "";
                    }
                    String groupType = customWidget.getGroupType();
                    arrayList.add(new EditWidget(name, widgetName, groupType != null ? groupType : "", null));
                }
            }
        }
        return arrayList;
    }

    private final float getSourceValueOrNumberValue(String value) {
        Float fValueOf;
        if (value == null) {
            return 0.0f;
        }
        try {
            fValueOf = Float.valueOf(Float.parseFloat(value));
        } catch (Exception unused) {
            fValueOf = null;
        }
        return fValueOf != null ? fValueOf.floatValue() : DialSourceUtilsKt.getSourceDefaultValue(value).floatValue();
    }

    private final String keyValue(XmlPullParser xmlPullParser, String str, String str2) {
        return xmlPullParser.getAttributeValue(str2, str);
    }

    public static /* synthetic */ String keyValue$default(DialXmlParser dialXmlParser, XmlPullParser xmlPullParser, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return dialXmlParser.keyValue(xmlPullParser, str, str2);
    }

    private final CustomWidget readCustomWidget(XmlPullParser parser) {
        return new CustomWidget(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "widgetName", null, 2, null), removeStartIfNeed(keyValue$default(this, parser, ServerSetting.SERVER_ENV_PREVIEW, null, 2, null)), removeStartIfNeed(keyValue$default(this, parser, "bg", null, 2, null)), removeStartIfNeed(keyValue$default(this, parser, "editBox", null, 2, null)), keyValue$default(this, parser, "bgColor", null, 2, null), removeStartIfNeed(keyValue$default(this, parser, "icon", null, 2, null)), keyValue$default(this, parser, "groupType", null, 2, null), keyValue$default(this, parser, "groupNameTranslation", null, 2, null), Float.valueOf(safeFloatValueParse$default(this, parser, Constants.DEVICE_TYPE_WEAR, 0.0f, 2, null)), Float.valueOf(safeFloatValueParse$default(this, parser, "h", 0.0f, 2, null)), keyValue$default(this, parser, "flex_direction", null, 2, null), keyValue$default(this, parser, "justify_content", null, 2, null), keyValue$default(this, parser, "align_content", null, 2, null), keyValue$default(this, parser, "align_items", null, 2, null), Float.valueOf(getAlignGap(parser)), readWidgetItemList(parser));
    }

    private final DataItemArcProgressBar readDataItemArcProgressBar(XmlPullParser parser) {
        return new DataItemArcProgressBar(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "source", null, 2, null), getRefString(parser), removeStartIfNeed(keyValue$default(this, parser, "bg", null, 2, null)), safeFloatValueParse$default(this, parser, "pivotX", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "pivotY", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "angleStart", 0.0f, 2, null), getSourceValueOrNumberValue(keyValue$default(this, parser, "valueStart", null, 2, null)), safeFloatValueParse$default(this, parser, "angleRange", 0.0f, 2, null), getSourceValueOrNumberValue(keyValue$default(this, parser, "valueRange", null, 2, null)), checkUesSourceEnable(keyValue$default(this, parser, "valueRange", null, 2, null)) || checkUesSourceEnable(keyValue$default(this, parser, "valueStart", null, 2, null)), safeFloatValueParse$default(this, parser, "barRadius", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "barWidth", 0.0f, 2, null), keyValue$default(this, parser, "endingStyle", null, 2, null), removeStartIfNeed(keyValue$default(this, parser, "indicatorImage", null, 2, null)), safeFloatValueParse(parser, "indicatorRadius", 0.0f), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "supportRecolor", false, 2, null)), keyValue$default(this, parser, "renderRule", null, 2, null));
    }

    private final DataItemImageNumber readDataItemImageNumber(XmlPullParser parser) {
        return new DataItemImageNumber(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "source", null, 2, null), getRefString(parser), safeIntValueParse$default(this, parser, "totalDigits", 0, 2, null), safeIntValueParse$default(this, parser, "decimalDigits", 0, 2, null), keyValue$default(this, parser, "align", null, 2, null), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "leadingZero", false, 2, null)), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "trailingZero", false, 2, null)), removeStartIfNeed(keyValue$default(this, parser, "unitIcon", null, 2, null)), safeFloatValueParse$default(this, parser, "rotation", 0.0f, 2, null), (int) safeFloatValueParse$default(this, parser, "space", 0.0f, 2, null), safeIntValueParse$default(this, parser, "decimalOffsetX", 0, 2, null), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "supportRecolor", false, 2, null)), safeIntValueParse$default(this, parser, "parameter", 0, 2, null), keyValue$default(this, parser, "renderRule", null, 2, null));
    }

    private final DataItemImageValues readDataItemImageValues(XmlPullParser parser) {
        return new DataItemImageValues(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "source", null, 2, null), getRefString(parser), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "hasInvalidValueImage", false, 2, null)), Float.valueOf(safeFloatValueParse$default(this, parser, "rotation", 0.0f, 2, null)), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "supportRecolor", false, 2, null)), readParamList(parser));
    }

    private final DataItemLineProgressBar readDataItemLineProgressBar(XmlPullParser parser) {
        return new DataItemLineProgressBar(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "source", null, 2, null), getRefString(parser), removeStartIfNeed(keyValue$default(this, parser, "bg", null, 2, null)), safeFloatValueParse$default(this, parser, "startX", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "startY", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "endX", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "endY", 0.0f, 2, null), getSourceValueOrNumberValue(keyValue$default(this, parser, "valueStart", null, 2, null)), getSourceValueOrNumberValue(keyValue$default(this, parser, "valueRange", null, 2, null)), checkUesSourceEnable(keyValue$default(this, parser, "valueRange", null, 2, null)) || checkUesSourceEnable(keyValue$default(this, parser, "valueStart", null, 2, null)), safeFloatValueParse$default(this, parser, "barWidth", 0.0f, 2, null), keyValue$default(this, parser, "endingStyle", null, 2, null), removeStartIfNeed(keyValue$default(this, parser, "indicatorImage", null, 2, null)), safeFloatValueParse$default(this, parser, "indicatorOffsetX", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "indicatorOffsetY", 0.0f, 2, null), Boolean.valueOf(safeBooleanValueParse$default(this, parser, "supportRecolor", false, 2, null)));
    }

    private final DataItemPointer readDataItemPointer(XmlPullParser parser) {
        String strKeyValue$default = keyValue$default(this, parser, "name", null, 2, null);
        String strKeyValue$default2 = keyValue$default(this, parser, "source", null, 2, null);
        String refString = getRefString(parser);
        float fSafeFloatValueParse$default = safeFloatValueParse$default(this, parser, "pivotX", 0.0f, 2, null);
        float fSafeFloatValueParse$default2 = safeFloatValueParse$default(this, parser, "pivotY", 0.0f, 2, null);
        float fSafeFloatValueParse$default3 = safeFloatValueParse$default(this, parser, "angleStart", 0.0f, 2, null);
        float fSafeFloatValueParse$default4 = safeFloatValueParse$default(this, parser, "angleRange", 0.0f, 2, null);
        float sourceValueOrNumberValue = getSourceValueOrNumberValue(keyValue$default(this, parser, "valueStart", null, 2, null));
        float sourceValueOrNumberValue2 = getSourceValueOrNumberValue(keyValue$default(this, parser, "valueRange", null, 2, null));
        boolean z = checkUesSourceEnable(keyValue$default(this, parser, "valueRange", null, 2, null)) || checkUesSourceEnable(keyValue$default(this, parser, "valueStart", null, 2, null));
        boolean zSafeBooleanValueParse$default = safeBooleanValueParse$default(this, parser, "supportRecolor", false, 2, null);
        return new DataItemPointer(strKeyValue$default, strKeyValue$default2, refString, fSafeFloatValueParse$default, fSafeFloatValueParse$default2, fSafeFloatValueParse$default3, sourceValueOrNumberValue, fSafeFloatValueParse$default4, sourceValueOrNumberValue2, z, Boolean.valueOf(zSafeBooleanValueParse$default), keyValue$default(this, parser, "renderRule", null, 2, null), safeFloatValueParse$default(this, parser, "parameter", 0.0f, 2, null));
    }

    private final DataItemText readDataItemText(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = arrayList2;
        DataItemText dataItemText = new DataItemText(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "fontId", null, 2, null), safeFloatValueParse(parser, "fontSize", 10.0f), keyValue$default(this, parser, "fontWeight", null, 2, null), keyValue$default(this, parser, "color", null, 2, null), keyValue$default(this, parser, "style", null, 2, null), keyValue$default(this, parser, "align", null, 2, null), keyValue$default(this, parser, "longMode", null, 2, null), safeFloatValueParse(parser, "letterSpace", 0.0f), safeFloatValueParse$default(this, parser, Constants.DEVICE_TYPE_WEAR, 0.0f, 2, null), safeFloatValueParse$default(this, parser, "h", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "lineSpace", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "rotation", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "radius", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "startAngle", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "span", 0.0f, 2, null), keyValue$default(this, parser, "string", null, 2, null), safeIntValueParse$default(this, parser, "literal_num", 0, 2, null), safeIntValueParse$default(this, parser, "literal_string_length", 0, 2, null), keyValue$default(this, parser, "literal_font", null, 2, null), removeStartIfNeed(keyValue$default(this, parser, "literal_crop_font", null, 2, null)), arrayList2);
        while (!Intrinsics.areEqual(parser.getName(), "Content") && ((Intrinsics.areEqual(parser.getName(), "DataItemText") && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), "DataItemText")))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), "DataItemText")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                if (Intrinsics.areEqual(parser.getName(), "Content")) {
                    arrayList = arrayList3;
                    arrayList.add(new TextContent(keyValue$default(this, parser, "source", null, 2, null)));
                } else {
                    arrayList = arrayList3;
                }
                parser.next();
                arrayList3 = arrayList;
            }
        }
        return dataItemText;
    }

    private final Image readImage(XmlPullParser parser) {
        return new Image(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "src", null, 2, null), safeBooleanValueParse$default(this, parser, "recolorEnable", false, 2, null), keyValue$default(this, parser, "format", null, 2, null), keyValue$default(this, parser, "color", null, 2, null), keyValue$default(this, parser, "colorGroup", null, 2, null));
    }

    private final ImageArray readImageArray(XmlPullParser parser) {
        return new ImageArray(keyValue$default(this, parser, "name", null, 2, null), safeBooleanValueParse$default(this, parser, "recolorEnable", false, 2, null), keyValue$default(this, parser, "format", null, 2, null), readImageList(parser), keyValue$default(this, parser, "colorGroup", null, 2, null));
    }

    private final List<Image> readImageList(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (!Intrinsics.areEqual(parser.getName(), AIApiConstants.Image.NAME) && ((Intrinsics.areEqual(parser.getName(), "ImageArray") && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), "ImageArray")))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), "ImageArray")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                arrayList.add(readImage(parser));
                parser.next();
            }
        }
        return arrayList;
    }

    private final List<LanguageItem> readLanguageList(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (!Intrinsics.areEqual(parser.getName(), "Item") && ((Intrinsics.areEqual(parser.getName(), AIApiConstants.Translation.NAME) && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), AIApiConstants.Translation.NAME)))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), AIApiConstants.Translation.NAME)) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                arrayList.add(readTranslationItem(parser));
                parser.next();
            }
        }
        return arrayList;
    }

    private final Layout readLayout(XmlPullParser parser) {
        return new Layout(getRefString(parser), safeFloatValueParse$default(this, parser, "x", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "y", 0.0f, 2, null), removeStartIfNeed(keyValue$default(this, parser, "parameter", null, 2, null)));
    }

    private final List<Layout> readLayoutList(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (!Intrinsics.areEqual(parser.getName(), "Layout") && ((Intrinsics.areEqual(parser.getName(), "Theme") && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), "Theme")))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), "Theme")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                arrayList.add(readLayout(parser));
                parser.next();
            }
        }
        Logger.d(TAG, "readLayoutList result " + arrayList.size());
        return arrayList;
    }

    private final ResourceFile readLuaFile(XmlPullParser parser) {
        return new ResourceFile(keyValue$default(this, parser, "name", null, 2, null), keyValue$default(this, parser, "fileName", null, 2, null), removeStartIfNeed(keyValue$default(this, parser, ServerSetting.SERVER_ENV_PREVIEW, null, 2, null)));
    }

    private final Param readParam(XmlPullParser parser) {
        return new Param(safeFloatValueParse$default(this, parser, "offsetX", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "offsetY", 0.0f, 2, null), keyValue$default(this, parser, "value", null, 2, null));
    }

    private final List<Param> readParamList(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (!Intrinsics.areEqual(parser.getName(), "Param") && ((Intrinsics.areEqual(parser.getName(), "DataItemImageValues") && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), "DataItemImageValues")))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), "DataItemImageValues")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                arrayList.add(readParam(parser));
                parser.next();
            }
        }
        Logger.d(TAG, "readParamList result " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void readResourceMap(DialWatchFace dialWatchFace, XmlPullParser parser) throws XmlPullParserException, IOException {
        Sprite sprite;
        String name;
        CustomWidget customWidget;
        String name2;
        DataItemPointer dataItemPointer;
        String name3;
        DataItemText dataItemText;
        String name4;
        Translation translation;
        String name5;
        ResourceFile luaFile;
        String name6;
        Slot slot;
        String name7;
        List arrayList;
        List arrayList2;
        DataItemLineProgressBar dataItemLineProgressBar;
        String name8;
        DataItemImageNumber dataItemImageNumber;
        String name9;
        DataItemImageValues dataItemImageValues;
        String name10;
        DataItemArcProgressBar dataItemArcProgressBar;
        String name11;
        Logger.d(TAG, "readResourceMap start");
        parser.require(2, null, "Resources");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        parser.next();
        while (!Intrinsics.areEqual(parser.getName(), "Resources")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                String name12 = parser.getName();
                if (name12 != null) {
                    switch (name12.hashCode()) {
                        case -1811812635:
                            if (name12.equals("Sprite") && (name = (sprite = readSprite(parser)).getName()) != null) {
                                linkedHashMap.put(name, sprite);
                            }
                            break;
                        case -1704180124:
                            if (name12.equals("Widget") && (name2 = (customWidget = readCustomWidget(parser)).getName()) != null) {
                                linkedHashMap.put(name2, customWidget);
                            }
                            break;
                        case -1665781376:
                            if (name12.equals("DataItemPointer") && (name3 = (dataItemPointer = readDataItemPointer(parser)).getName()) != null) {
                                linkedHashMap.put(name3, dataItemPointer);
                            }
                            break;
                        case -1625894710:
                            if (name12.equals("DataItemText") && (name4 = (dataItemText = readDataItemText(parser)).getName()) != null) {
                                linkedHashMap.put(name4, dataItemText);
                            }
                            break;
                        case -172778863:
                            if (name12.equals(AIApiConstants.Translation.NAME) && (name5 = (translation = readTranslation(parser)).getName()) != null) {
                                linkedHashMap.put(name5, translation);
                            }
                            break;
                        case 2189724:
                            if (name12.equals("File") && (name6 = (luaFile = readLuaFile(parser)).getName()) != null) {
                                linkedHashMap.put(name6, luaFile);
                            }
                            break;
                        case 2579998:
                            if (name12.equals("Slot") && (name7 = (slot = readSlot(parser)).getName()) != null) {
                                linkedHashMap.put(name7, slot);
                            }
                            break;
                        case 70760763:
                            if (name12.equals(AIApiConstants.Image.NAME)) {
                                Image image = readImage(parser);
                                String name13 = image.getName();
                                if (name13 != null) {
                                    Object obj = linkedHashMap.get(name13);
                                    if (obj == null) {
                                        linkedHashMap.put(name13, image);
                                    } else if (obj instanceof Image) {
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(obj);
                                        arrayList3.add(image);
                                        linkedHashMap.put(name13, new ImageWrapper(arrayList3));
                                    } else if (obj instanceof ImageWrapper) {
                                        List<Image> list = ((ImageWrapper) obj).getList();
                                        if (list == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) list)) == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(image);
                                        linkedHashMap.put(name13, new ImageWrapper(arrayList));
                                    }
                                }
                            }
                            break;
                        case 522933726:
                            if (name12.equals("ImageArray")) {
                                ImageArray imageArray = readImageArray(parser);
                                String name14 = imageArray.getName();
                                if (name14 != null) {
                                    Object obj2 = linkedHashMap.get(name14);
                                    if (obj2 == null) {
                                        linkedHashMap.put(name14, imageArray);
                                    } else if (obj2 instanceof ImageArray) {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(obj2);
                                        arrayList4.add(imageArray);
                                        linkedHashMap.put(name14, new ImageArrayWrapper(arrayList4));
                                    } else if (obj2 instanceof ImageArrayWrapper) {
                                        List<ImageArray> list2 = ((ImageArrayWrapper) obj2).getList();
                                        if (list2 == null || (arrayList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) list2)) == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(imageArray);
                                        linkedHashMap.put(name14, new ImageArrayWrapper(arrayList2));
                                    }
                                }
                            }
                            break;
                        case 983805525:
                            if (name12.equals("DataItemLineProgressBar") && (name8 = (dataItemLineProgressBar = readDataItemLineProgressBar(parser)).getName()) != null) {
                                linkedHashMap.put(name8, dataItemLineProgressBar);
                            }
                            break;
                        case 1455577671:
                            if (name12.equals("DataItemImageNumber") && (name9 = (dataItemImageNumber = readDataItemImageNumber(parser)).getName()) != null) {
                                linkedHashMap.put(name9, dataItemImageNumber);
                            }
                            break;
                        case 1666128928:
                            if (name12.equals("DataItemImageValues") && (name10 = (dataItemImageValues = readDataItemImageValues(parser)).getName()) != null) {
                                linkedHashMap.put(name10, dataItemImageValues);
                            }
                            break;
                        case 1881196625:
                            if (name12.equals("DataItemArcProgressBar") && (name11 = (dataItemArcProgressBar = readDataItemArcProgressBar(parser)).getName()) != null) {
                                linkedHashMap.put(name11, dataItemArcProgressBar);
                            }
                            break;
                    }
                    return;
                }
                parser.next();
            }
        }
        Logger.d(TAG, "readResourceMap end map size " + linkedHashMap.size());
        dialWatchFace.setResourceMap(linkedHashMap);
    }

    private final Slot readSlot(XmlPullParser parser) throws XmlPullParserException, IOException {
        String strKeyValue$default = keyValue$default(this, parser, "name", null, 2, null);
        String strKeyValue$default2 = keyValue$default(this, parser, "type", null, 2, null);
        if (strKeyValue$default2 == null) {
            strKeyValue$default2 = "widget";
        }
        String str = strKeyValue$default2;
        boolean zSafeBooleanValueParse$default = safeBooleanValueParse$default(this, parser, "movable", false, 2, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (!Intrinsics.areEqual(parser.getName(), "Item") && ((Intrinsics.areEqual(parser.getName(), "Slot") && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), "Slot")))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), "Slot")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                String name = parser.getName();
                if (Intrinsics.areEqual(name, "Item")) {
                    arrayList.add(new SlotWidgetItem(getRefString(parser)));
                } else if (Intrinsics.areEqual(name, "Position")) {
                    arrayList2.add(new SlotPosition(safeFloatValueParse$default(this, parser, "x", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "y", 0.0f, 2, null)));
                }
                parser.next();
            }
        }
        return new Slot(strKeyValue$default, str, zSafeBooleanValueParse$default, arrayList, arrayList2);
    }

    private final Sprite readSprite(XmlPullParser parser) {
        return new Sprite(keyValue$default(this, parser, "name", null, 2, null), getRefString(parser), getRefExtString(parser), safeIntValueParse(parser, "interval", 0), safeIntValueParse(parser, "repeatCount", 0));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0296  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0200  */
    /* JADX WARN: Code duplicated, block: B:98:0x024b  */
    private final void readTheme(DialWatchFace dialWatchFace, XmlPullParser parser, String path) {
        int i;
        SlotEditItem slotEditItem;
        SlotEditItem slotEditItem2;
        SlotEditItem slotEditItem3;
        Iterator it;
        Map<String, Object> map;
        String name;
        Bitmap bitmapDecodeFile;
        TextContent textContent;
        List<SlotPosition> positionList;
        String name2;
        Logger.d(TAG, "readTheme start");
        String strKeyValue$default = keyValue$default(this, parser, "type", null, 2, null);
        String strRemoveStartIfNeed = removeStartIfNeed(keyValue$default(this, parser, "bg", null, 2, null));
        boolean zSafeBooleanValueParse$default = safeBooleanValueParse$default(this, parser, "isPhotoAlbumWatchface", false, 2, null);
        boolean zSafeBooleanValueParse$default2 = safeBooleanValueParse$default(this, parser, "isVideoAlbumWatchface", false, 2, null);
        String strKeyValue$default2 = keyValue$default(this, parser, "name", null, 2, null);
        String strKeyValue$default3 = keyValue$default(this, parser, "bgColor", null, 2, null);
        String strRemoveStartIfNeed2 = removeStartIfNeed(keyValue$default(this, parser, "fg", null, 2, null));
        String strRemoveStartIfNeed3 = removeStartIfNeed(keyValue$default(this, parser, ServerSetting.SERVER_ENV_PREVIEW, null, 2, null));
        String strKeyValue$default4 = keyValue$default(this, parser, "colorGroupTable", null, 2, null);
        Theme theme = new Theme(strKeyValue$default, strKeyValue$default2, strRemoveStartIfNeed, strKeyValue$default3, strRemoveStartIfNeed2, strRemoveStartIfNeed3, zSafeBooleanValueParse$default, strKeyValue$default4 != null ? StringsKt__StringsKt.split$default((CharSequence) strKeyValue$default4, new String[]{","}, false, 0, 6, (Object) null) : null, readLayoutList(parser), null, null, null, 0, zSafeBooleanValueParse$default2, 7680, null);
        List<Layout> layoutList = theme.getLayoutList();
        if (layoutList == null || layoutList.isEmpty()) {
            return;
        }
        if (Intrinsics.areEqual(strKeyValue$default, "normal")) {
            List<Theme> normalThemeList = dialWatchFace.getNormalThemeList();
            if (normalThemeList == null) {
                normalThemeList = new ArrayList<>();
            }
            normalThemeList.add(theme);
            dialWatchFace.setNormalThemeList(normalThemeList);
        } else if (Intrinsics.areEqual(strKeyValue$default, "AOD")) {
            List<Theme> aodThemeList = dialWatchFace.getAodThemeList();
            if (aodThemeList == null) {
                aodThemeList = new ArrayList<>();
            }
            aodThemeList.add(theme);
            dialWatchFace.setAodThemeList(aodThemeList);
        }
        Map<String, Object> resourceMap = dialWatchFace.getResourceMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<DataItemText> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iCoerceAtLeast = 0;
        for (Layout layout : theme.getLayoutList()) {
            if (layout.getRef() != null) {
                Object obj = resourceMap != null ? resourceMap.get(layout.getRef()) : null;
                if (obj != null) {
                    if (obj instanceof Slot) {
                        Slot slot = (Slot) obj;
                        List<SlotPosition> positionList2 = slot.getPositionList();
                        iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(iCoerceAtLeast, positionList2 != null ? positionList2.size() : 0);
                        String type = slot.getType();
                        List arrayList3 = (List) linkedHashMap.get(type);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(slot);
                        linkedHashMap.put(type, arrayList3);
                        if (slot.getMovable() && (positionList = slot.getPositionList()) != null && !positionList.isEmpty()) {
                            arrayList2.add(slot);
                        }
                    } else if (obj instanceof DataItemText) {
                        DataItemText dataItemText = (DataItemText) obj;
                        if (dataItemText.getLiteralNum() != 0 && (name2 = dataItemText.getName()) != null && name2.length() != 0) {
                            arrayList.add(dataItemText);
                        }
                    }
                }
            }
        }
        theme.setSlotMap(linkedHashMap);
        theme.setPositionCount(iCoerceAtLeast);
        theme.setMovableSlot(arrayList2);
        DialEditEntity dialEditEntity = new DialEditEntity();
        List<String> colorGroupTable = theme.getColorGroupTable();
        dialEditEntity.setColorGroupIndex((colorGroupTable == null || colorGroupTable.isEmpty() || !checkColorTableAllEffective(theme.getColorGroupTable())) ? -1 : 0);
        List<String> recolorTable = dialWatchFace.getRecolorTable();
        if (recolorTable == null || recolorTable.isEmpty()) {
            i = -1;
        } else {
            List<String> recolorTable2 = dialWatchFace.getRecolorTable();
            Intrinsics.checkNotNull(recolorTable2);
            if (checkColorTableAllEffective(recolorTable2)) {
                i = 0;
            } else {
                i = -1;
            }
        }
        dialEditEntity.setRecolorIndex(i);
        dialEditEntity.setPositionIndex(iCoerceAtLeast > 0 ? 0 : -1);
        Collection collection = (Collection) linkedHashMap.get(SlotType.DIAL);
        if (collection == null || collection.isEmpty()) {
            slotEditItem = null;
        } else {
            Object obj2 = linkedHashMap.get(SlotType.DIAL);
            Intrinsics.checkNotNull(obj2);
            Slot slot2 = (Slot) ((List) obj2).get(0);
            Intrinsics.checkNotNull(resourceMap);
            List<EditWidget> slotEditWidgetList = getSlotEditWidgetList(slot2, resourceMap);
            if (slotEditWidgetList.isEmpty()) {
                slotEditItem = null;
            } else {
                String name3 = slot2.getName();
                Intrinsics.checkNotNull(name3);
                slotEditItem = new SlotEditItem(name3, slot2.getMovable(), 0, slotEditWidgetList, slot2.getPositionList());
            }
        }
        dialEditEntity.setDialSlotEditItem(slotEditItem);
        Collection collection2 = (Collection) linkedHashMap.get("time");
        if (collection2 == null || collection2.isEmpty()) {
            slotEditItem2 = null;
        } else {
            Object obj3 = linkedHashMap.get("time");
            Intrinsics.checkNotNull(obj3);
            Slot slot3 = (Slot) ((List) obj3).get(0);
            Intrinsics.checkNotNull(resourceMap);
            List<EditWidget> slotEditWidgetList2 = getSlotEditWidgetList(slot3, resourceMap);
            if (slotEditWidgetList2.isEmpty()) {
                slotEditItem2 = null;
            } else {
                String name4 = slot3.getName();
                Intrinsics.checkNotNull(name4);
                slotEditItem2 = new SlotEditItem(name4, slot3.getMovable(), 0, slotEditWidgetList2, slot3.getPositionList());
            }
        }
        dialEditEntity.setTimeSlotEditItem(slotEditItem2);
        Collection collection3 = (Collection) linkedHashMap.get(SlotType.FONT);
        if (collection3 == null || collection3.isEmpty()) {
            slotEditItem3 = null;
        } else {
            Object obj4 = linkedHashMap.get(SlotType.FONT);
            Intrinsics.checkNotNull(obj4);
            Slot slot4 = (Slot) ((List) obj4).get(0);
            Intrinsics.checkNotNull(resourceMap);
            List<EditWidget> slotEditWidgetList3 = getSlotEditWidgetList(slot4, resourceMap);
            if (slotEditWidgetList3.isEmpty()) {
                slotEditItem3 = null;
            } else {
                String name5 = slot4.getName();
                Intrinsics.checkNotNull(name5);
                slotEditItem3 = new SlotEditItem(name5, slot4.getMovable(), 0, slotEditWidgetList3, slot4.getPositionList());
            }
        }
        dialEditEntity.setFontSlotEditItem(slotEditItem3);
        if (Intrinsics.areEqual(theme.getType(), "normal")) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (DataItemText dataItemText2 : arrayList) {
                arrayList4.addAll(dataItemText2.getTextList());
                String name6 = dataItemText2.getName();
                Intrinsics.checkNotNull(name6);
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) dataItemText2.getTextList());
                int literalStringLength = dataItemText2.getLiteralStringLength();
                String literalWholeFont = dataItemText2.getLiteralWholeFont();
                List<TextContent> sourceList = dataItemText2.getSourceList();
                arrayList5.add(new FaceEditLiteralBean(name6, mutableList, -1, literalStringLength, literalWholeFont, (sourceList == null || (textContent = (TextContent) CollectionsKt___CollectionsKt.getOrNull(sourceList, 0)) == null) ? null : textContent.getSource()));
            }
            dialEditEntity.setTextItemList(arrayList5);
            dialWatchFace.setTextList(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4));
        }
        List list = (List) linkedHashMap.get("widget");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Slot slot5 = (Slot) it2.next();
                List<SlotWidgetItem> itemList = slot5.getItemList();
                List<SlotWidgetItem> list3 = itemList;
                if (list3 == null || list3.isEmpty() || (name = slot5.getName()) == null || StringsKt__StringsKt.isBlank(name)) {
                    it = it2;
                    map = resourceMap;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<T> it3 = itemList.iterator();
                    while (it3.hasNext()) {
                        Object obj5 = resourceMap != null ? resourceMap.get(((SlotWidgetItem) it3.next()).getRef()) : null;
                        if (obj5 instanceof CustomWidget) {
                            CustomWidget customWidget = (CustomWidget) obj5;
                            String icon = customWidget.getIcon();
                            Object obj6 = (icon == null || StringsKt__StringsKt.isBlank(icon)) ? null : resourceMap.get(icon);
                            if (obj6 instanceof Image) {
                                String dialResourceFilePath = DialFileUtils.INSTANCE.getDialResourceFilePath(path);
                                String src = ((Image) obj6).getSrc();
                                if (src == null) {
                                    src = "";
                                }
                                bitmapDecodeFile = BitmapFactory.decodeFile(new File(dialResourceFilePath, src).getPath());
                            } else {
                                bitmapDecodeFile = null;
                            }
                            String name7 = customWidget.getName();
                            if (name7 == null) {
                                name7 = "";
                            }
                            DialXmlParser dialXmlParser = INSTANCE;
                            String widgetName = customWidget.getWidgetName();
                            String str = widgetName == null ? "" : widgetName;
                            Map<String, ? extends Object> resourceMap2 = dialWatchFace.getResourceMap();
                            Intrinsics.checkNotNull(resourceMap2);
                            String strFindXmlTranslation = dialXmlParser.findXmlTranslation(str, resourceMap2);
                            String groupType = customWidget.getGroupType();
                            arrayList7.add(new EditWidget(name7, strFindXmlTranslation, groupType != null ? groupType : "", bitmapDecodeFile));
                        }
                        it2 = it2;
                        resourceMap = resourceMap;
                    }
                    it = it2;
                    map = resourceMap;
                    arrayList6.add(new SlotEditItem(slot5.getName(), slot5.getMovable(), 0, arrayList7, slot5.getPositionList()));
                }
                it2 = it;
                resourceMap = map;
            }
            dialEditEntity.setSlotItemList(arrayList6);
        }
        theme.setDialEditEntity(dialEditEntity);
    }

    private final Translation readTranslation(XmlPullParser parser) {
        return new Translation(keyValue$default(this, parser, "name", null, 2, null), readLanguageList(parser));
    }

    private final LanguageItem readTranslationItem(XmlPullParser parser) {
        return new LanguageItem(keyValue$default(this, parser, "language", null, 2, null), keyValue$default(this, parser, "str", null, 2, null));
    }

    private final void readWatchFace(DialWatchFace dialWatchFace, XmlPullParser parser) {
        Logger.d(TAG, "readWatchFace start");
        String strKeyValue$default = keyValue$default(this, parser, "name", null, 2, null);
        if (strKeyValue$default == null) {
            strKeyValue$default = "";
        }
        dialWatchFace.setName(strKeyValue$default);
        String strKeyValue$default2 = keyValue$default(this, parser, "id", null, 2, null);
        dialWatchFace.setId(strKeyValue$default2 != null ? strKeyValue$default2 : "");
        dialWatchFace.setWidth(safeFloatValueParse$default(this, parser, "width", 0.0f, 2, null));
        dialWatchFace.setHeight(safeFloatValueParse$default(this, parser, "height", 0.0f, 2, null));
        dialWatchFace.setEditable(safeBooleanValueParse$default(this, parser, "editable", false, 2, null));
        dialWatchFace.setSkuStatus(safeBooleanValueParse$default(this, parser, "SKU", false, 2, null));
        String strKeyValue$default3 = keyValue$default(this, parser, "recolorTable", null, 2, null);
        dialWatchFace.setRecolorTable(strKeyValue$default3 != null ? StringsKt__StringsKt.split$default((CharSequence) strKeyValue$default3, new String[]{","}, false, 0, 6, (Object) null) : null);
        String strKeyValue$default4 = keyValue$default(this, parser, "colorGroupTable", null, 2, null);
        dialWatchFace.setColorGroupTable(strKeyValue$default4 != null ? StringsKt__StringsKt.split$default((CharSequence) strKeyValue$default4, new String[]{","}, false, 0, 6, (Object) null) : null);
        dialWatchFace.setPowerConsumptionLevel(safeIntValueParse$default(this, parser, "powerConsumptionLevel", 0, 2, null));
        dialWatchFace.setSupportLiteral(safeBooleanValueParse$default(this, parser, "support_literal", false, 2, null));
        Logger.d(TAG, "readWatchFace end " + dialWatchFace);
    }

    private final WidgetItem readWidgetItem(XmlPullParser parser) {
        return new WidgetItem(getRefString(parser), safeFloatValueParse$default(this, parser, "x", 0.0f, 2, null), safeFloatValueParse$default(this, parser, "y", 0.0f, 2, null));
    }

    private final List<WidgetItem> readWidgetItemList(XmlPullParser parser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (!Intrinsics.areEqual(parser.getName(), "Item") && ((Intrinsics.areEqual(parser.getName(), "Widget") && parser.getEventType() != 3) || (parser.getEventType() == 3 && !Intrinsics.areEqual(parser.getName(), "Widget")))) {
            parser.next();
        }
        while (!Intrinsics.areEqual(parser.getName(), "Widget")) {
            if (parser.getEventType() != 2) {
                parser.next();
            } else {
                arrayList.add(readWidgetItem(parser));
                parser.next();
            }
        }
        return arrayList;
    }

    private final DialWatchFace readXmlDetail(XmlPullParser parser, String path) throws XmlPullParserException, IOException {
        DialWatchFace dialWatchFace;
        DialWatchFace dialWatchFace2 = dialWatchFace;
        DialWatchFace dialWatchFace3 = new DialWatchFace(null, null, 0.0f, 0.0f, false, false, null, null, 0, false, null, null, null, null, 0, 32767, null);
        while (parser.next() != 1) {
            String name = parser.getName();
            if (parser.getEventType() == 2 && name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode == 20897285) {
                    dialWatchFace = dialWatchFace2;
                    if (name.equals("Resources")) {
                        readResourceMap(dialWatchFace, parser);
                    }
                } else if (iHashCode == 80774569) {
                    dialWatchFace = dialWatchFace2;
                    if (name.equals("Theme")) {
                        readTheme(dialWatchFace, parser, path);
                    }
                } else if (iHashCode != 1723841420) {
                    dialWatchFace = dialWatchFace2;
                } else if (name.equals("Watchface")) {
                    readWatchFace(dialWatchFace2, parser);
                }
                dialWatchFace2 = dialWatchFace;
            }
        }
        DialWatchFace dialWatchFace4 = dialWatchFace2;
        List<Theme> normalThemeList = dialWatchFace4.getNormalThemeList();
        dialWatchFace4.setThemeIndex((normalThemeList == null || normalThemeList.isEmpty()) ? -1 : 0);
        return dialWatchFace4;
    }

    private final String removeStartIfNeed(String ref) {
        if (ref == null || StringsKt__StringsKt.isBlank(ref)) {
            return null;
        }
        return !StringsKt__StringsJVMKt.startsWith$default(ref, gv5.CONNECT_VALUE_STR, false, 2, null) ? ref : StringsKt__StringsKt.removeRange((CharSequence) ref, 0, 1).toString();
    }

    private final boolean safeBooleanValueParse(XmlPullParser xmlPullParser, String str, boolean z) {
        try {
            String strKeyValue$default = keyValue$default(this, xmlPullParser, str, null, 2, null);
            return strKeyValue$default != null ? Boolean.parseBoolean(strKeyValue$default) : z;
        } catch (Exception e) {
            Logger.i(TAG, "bool parse exception " + str + ";" + e);
            return z;
        }
    }

    public static /* synthetic */ boolean safeBooleanValueParse$default(DialXmlParser dialXmlParser, XmlPullParser xmlPullParser, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dialXmlParser.safeBooleanValueParse(xmlPullParser, str, z);
    }

    private final float safeFloatValueParse(XmlPullParser xmlPullParser, String str, float f) {
        try {
            String strKeyValue$default = keyValue$default(this, xmlPullParser, str, null, 2, null);
            return strKeyValue$default != null ? Float.parseFloat(strKeyValue$default) : f;
        } catch (Exception e) {
            Logger.i(TAG, "float parse exception " + str + ";" + e);
            return f;
        }
    }

    public static /* synthetic */ float safeFloatValueParse$default(DialXmlParser dialXmlParser, XmlPullParser xmlPullParser, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return dialXmlParser.safeFloatValueParse(xmlPullParser, str, f);
    }

    private final int safeIntValueParse(XmlPullParser xmlPullParser, String str, int i) {
        try {
            String strKeyValue$default = keyValue$default(this, xmlPullParser, str, null, 2, null);
            return strKeyValue$default != null ? Integer.parseInt(strKeyValue$default) : i;
        } catch (Exception e) {
            Logger.i(TAG, "int parse exception " + str + ";" + e);
            return i;
        }
    }

    public static /* synthetic */ int safeIntValueParse$default(DialXmlParser dialXmlParser, XmlPullParser xmlPullParser, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return dialXmlParser.safeIntValueParse(xmlPullParser, str, i);
    }

    private final void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = parser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public final boolean checkColorTableAllEffective(@NotNull List<String> colorList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        if (colorList.isEmpty()) {
            return false;
        }
        Iterator<T> it = colorList.iterator();
        while (it.hasNext()) {
            if (DialEditHelper.INSTANCE.safeColorParse((String) it.next()) == null) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final DialWatchFace parseDialXml(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(DialFileUtils.INSTANCE.getDialResourceFilePath(filePath), "manifest.xml");
        if (!file.exists()) {
            Logger.e(TAG, "parseDialXml file not exits!! " + file);
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                Intrinsics.checkNotNullExpressionValue(xmlPullParserNewPullParser, "newPullParser(...)");
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
                DialWatchFace xmlDetail = INSTANCE.readXmlDetail(xmlPullParserNewPullParser, filePath);
                Logger.i(TAG, "parseDialXml success " + file + ";detail " + xmlDetail.getShortString());
                CloseableKt.closeFinally(fileInputStream, null);
                return xmlDetail;
            } catch (Exception e) {
                e.printStackTrace();
                CloseableKt.closeFinally(fileInputStream, null);
                return null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }
}
