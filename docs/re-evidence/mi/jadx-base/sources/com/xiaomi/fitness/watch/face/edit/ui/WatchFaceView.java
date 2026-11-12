package com.xiaomi.fitness.watch.face.edit.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.watch.face.edit.entity.CustomWidget;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemArcProgressBar;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemImageNumber;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemImageValues;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemLineProgressBar;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemPointer;
import com.xiaomi.fitness.watch.face.edit.entity.DataItemText;
import com.xiaomi.fitness.watch.face.edit.entity.DialEditEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.entity.Image;
import com.xiaomi.fitness.watch.face.edit.entity.ImageArray;
import com.xiaomi.fitness.watch.face.edit.entity.ImageArrayWrapper;
import com.xiaomi.fitness.watch.face.edit.entity.ImageWrapper;
import com.xiaomi.fitness.watch.face.edit.entity.Layout;
import com.xiaomi.fitness.watch.face.edit.entity.Param;
import com.xiaomi.fitness.watch.face.edit.entity.RecolorCustom;
import com.xiaomi.fitness.watch.face.edit.entity.ResourceFile;
import com.xiaomi.fitness.watch.face.edit.entity.Slot;
import com.xiaomi.fitness.watch.face.edit.entity.SlotEditItem;
import com.xiaomi.fitness.watch.face.edit.entity.SlotPosition;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import com.xiaomi.fitness.watch.face.edit.entity.SlotWidgetItem;
import com.xiaomi.fitness.watch.face.edit.entity.Sprite;
import com.xiaomi.fitness.watch.face.edit.entity.TextContent;
import com.xiaomi.fitness.watch.face.edit.entity.Theme;
import com.xiaomi.fitness.watch.face.edit.entity.WidgetItem;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.edit.utils.DialSourceUtilsKt;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0092\u00012\u00020\u0001:\u0002\u0092\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJT\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020$H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010.\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010/\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0002J4\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u0018H\u0002J(\u00108\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u00109\u001a\u00020:2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002J(\u0010;\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u00104\u001a\u00020<2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002J \u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020BH\u0002J\u001e\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010\u00102\b\u0010F\u001a\u0004\u0018\u00010\u0010H\u0002J6\u0010G\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100I\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070I0H2\u0006\u0010J\u001a\u00020\u00102\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0IH\u0002J%\u0010M\u001a\u0004\u0018\u00010\u00102\u0006\u0010N\u001a\u00020\u00102\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00110PH\u0002¢\u0006\u0002\u0010QJ(\u0010R\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010S\u001a\u00020T2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002J(\u0010U\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010S\u001a\u00020V2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002J8\u0010W\u001a\u00020$2\u0006\u0010S\u001a\u00020V2\u0006\u0010X\u001a\u00020\u001d2\u0006\u0010Y\u001a\u00020\u001d2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0002J(\u0010\\\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010]\u001a\u00020^2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002JH\u0010_\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010`\u001a\u00020a2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010c\u001a\u00020\u00182\b\b\u0002\u0010d\u001a\u00020\u0018H\u0002J6\u0010e\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010`\u001a\u00020a2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g0IH\u0002J&\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030I2\u0006\u0010*\u001a\u00020+2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g0IH\u0002J4\u0010i\u001a\u0004\u0018\u0001032\u0006\u0010*\u001a\u00020+2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u0018H\u0002J4\u0010n\u001a\u0004\u0018\u0001032\u0006\u0010*\u001a\u00020+2\u0006\u00104\u001a\u00020o2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u0018H\u0002J4\u0010p\u001a\u0004\u0018\u0001032\u0006\u0010*\u001a\u00020+2\u0006\u00104\u001a\u00020q2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u0018H\u0002J4\u0010r\u001a\u0004\u0018\u0001032\u0006\u0010*\u001a\u00020+2\u0006\u0010s\u001a\u00020t2\u0006\u0010l\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u0018H\u0002JL\u0010u\u001a\u0004\u0018\u0001032\u0006\u0010*\u001a\u00020+2\u0006\u0010l\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020w0I2\u0006\u0010s\u001a\u00020t2\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u0010x\u001a\u00020\u0018H\u0002Jk\u0010y\u001a\u0004\u0018\u0001032\u0006\u0010*\u001a\u00020+2\u0006\u0010z\u001a\u00020w2\u0006\u0010l\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u00182\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010}2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\u001d2\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0002¢\u0006\u0003\u0010\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u0001032\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0002J\u001b\u0010\u0085\u0001\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\b\u0010'\u001a\u0004\u0018\u00010\u0010H\u0002J*\u0010\u0086\u0001\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0007\u0010S\u001a\u00030\u0087\u00012\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002J\u0016\u0010\u0088\u0001\u001a\u0004\u0018\u00010w2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u008a\u0001\u001a\u0004\u0018\u00010w2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0011H\u0002J\u0017\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0010H\u0002J\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0011H\u0002J\u001b\u0010\u008f\u0001\u001a\u00020$2\u0007\u0010\u0090\u0001\u001a\u00020\u00072\u0007\u0010\u0091\u0001\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0093\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/ui/WatchFaceView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mWidth", "mHeight", "mWatchFace", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "mResourceMap", "", "", "", "mTheme", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "mFilePath", "faceEditPhotoBean", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "onlyForeground", "", "isPortrait", "positionIndex", "Ljava/lang/Integer;", "editScale", "", "bitmapPaint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "mDefaultVideoThumbPath", "fillView", "", "watchFace", "theme", "filePath", "defaultVideoThumbPath", "onDraw", "canvas", "Landroid/graphics/Canvas;", "initPaint", "drawBgIfNeed", "drawFgIfNeed", "drawLayout", "layout", "Lcom/xiaomi/fitness/watch/face/edit/entity/Layout;", "drawAny", "Lcom/xiaomi/fitness/watch/face/edit/ui/DecodeBoundItem;", "any", "drawX", "drawY", "onlyDecodeBound", "drawSprite", "sprite", "Lcom/xiaomi/fitness/watch/face/edit/entity/Sprite;", "drawDataItemText", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemText;", "customLineBreak", "text", "maxWidth", "isPunctuation", "ch", "", "getTextTypeFace", "Landroid/graphics/Typeface;", "fontId", "fontWeight", "getTextAndColorStrList", "Lkotlin/Pair;", "", "textStr", "sourceList", "Lcom/xiaomi/fitness/watch/face/edit/entity/TextContent;", "stringFormatBySource", "formatString", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "drawDataItemLineProgressBar", "item", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemLineProgressBar;", "drawDataItemArcProgressBar", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemArcProgressBar;", "drawArcIndicatorImageIfNeed", "centerX", "centerY", "angleStart", "sweepAngle", "drawSlot", "slot", "Lcom/xiaomi/fitness/watch/face/edit/entity/Slot;", "drawCustomWidget", "widget", "Lcom/xiaomi/fitness/watch/face/edit/entity/CustomWidget;", "slotType", "showEditBox", "needScale", "drawFlexBoxWidgetList", "widgetItemList", "Lcom/xiaomi/fitness/watch/face/edit/entity/WidgetItem;", "getWidgetListWidthHeight", "drawDataItemImageValues", "imageValues", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageValues;", "x", "y", "drawImageWrapper", "Lcom/xiaomi/fitness/watch/face/edit/entity/ImageWrapper;", "drawDataItemPointer", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemPointer;", "drawDataItemImageNumber", "imageNumber", "Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageNumber;", "drawImageNumberByArray", "fileArray", "Lcom/xiaomi/fitness/watch/face/edit/entity/Image;", "imageArrayRecolorEnable", "drawImage", "image", "scale", "recolorCustom", "Lcom/xiaomi/fitness/watch/face/edit/entity/RecolorCustom;", "rotateDegrees", "porterMode", "Landroid/graphics/Xfermode;", "(Landroid/graphics/Canvas;Lcom/xiaomi/fitness/watch/face/edit/entity/Image;FFZLjava/lang/Float;Lcom/xiaomi/fitness/watch/face/edit/entity/RecolorCustom;Ljava/lang/Float;Landroid/graphics/Xfermode;)Lcom/xiaomi/fitness/watch/face/edit/ui/DecodeBoundItem;", "decodeImageWidthHeight", "file", "Ljava/io/File;", "drawPhotoImage", "drawFile", "Lcom/xiaomi/fitness/watch/face/edit/entity/ResourceFile;", "expectGetImageByRefKey", "refKey", "expectGetImage", "refObj", "expectGetImageArrayByRefKey", "Lcom/xiaomi/fitness/watch/face/edit/entity/ImageArray;", "expectGetImageArray", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWatchFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceView.kt\ncom/xiaomi/fitness/watch/face/edit/ui/WatchFaceView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1390:1\n1#2:1391\n1863#3,2:1392\n1872#3,3:1394\n1863#3,2:1397\n1863#3,2:1399\n1872#3,3:1401\n1557#3:1404\n1628#3,3:1405\n1863#3,2:1412\n1872#3,3:1414\n1872#3,3:1417\n1872#3,3:1420\n1872#3,3:1423\n1872#3,3:1426\n1863#3,2:1429\n37#4:1408\n36#4,3:1409\n*S KotlinDebug\n*F\n+ 1 WatchFaceView.kt\ncom/xiaomi/fitness/watch/face/edit/ui/WatchFaceView\n*L\n305#1:1392,2\n320#1:1394,3\n343#1:1397,2\n376#1:1399,2\n386#1:1401,3\n493#1:1404\n493#1:1405,3\n857#1:1412,2\n886#1:1414,3\n899#1:1417,3\n923#1:1420,3\n935#1:1423,3\n1157#1:1426,3\n1183#1:1429,2\n501#1:1408\n501#1:1409,3\n*E\n"})
public final class WatchFaceView extends View {

    @NotNull
    public static final String TAG = "WatchFaceView";

    @NotNull
    private final Paint bitmapPaint;
    private float editScale;

    @Nullable
    private FaceEditPhotoBean faceEditPhotoBean;
    private boolean isPortrait;

    @Nullable
    private String mDefaultVideoThumbPath;

    @Nullable
    private String mFilePath;
    private int mHeight;

    @Nullable
    private Map<String, ? extends Object> mResourceMap;

    @Nullable
    private Theme mTheme;

    @Nullable
    private DialWatchFace mWatchFace;
    private int mWidth;
    private boolean onlyForeground;

    @Nullable
    private Integer positionIndex;

    @NotNull
    private final TextPaint textPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WatchFaceView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String customLineBreak(String text, int maxWidth, TextPaint textPaint) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = text.charAt(i3);
            float fMeasureText = textPaint.measureText(String.valueOf(cCharAt));
            if (isPunctuation(cCharAt)) {
                z2 = true;
            }
            float f = maxWidth;
            if (fMeasureText > f) {
                z = true;
                break;
            }
            if (i + fMeasureText > f) {
                sb.append((CharSequence) text, i2, i3);
                sb.append("\n");
                i = 0;
                i2 = i3;
            }
            i = (int) (i + fMeasureText);
        }
        if (i2 < text.length()) {
            sb.append((CharSequence) text, i2, text.length());
        }
        Logger.i(TAG, "custombreak " + ((Object) sb));
        if (z2) {
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return StringsKt__StringsKt.trim((CharSequence) string).toString();
        }
        if (!z) {
            return text;
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return StringsKt__StringsKt.trim((CharSequence) string2).toString();
    }

    private final DecodeBoundItem decodeImageWidthHeight(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            return new DecodeBoundItem(i, i2, i, i2);
        } catch (Exception unused) {
            return null;
        }
    }

    private final DecodeBoundItem drawAny(Object any, Canvas canvas, float drawX, float drawY, boolean onlyDecodeBound) {
        if (any instanceof Image) {
            return drawImage$default(this, canvas, (Image) any, drawX, drawY, onlyDecodeBound, null, null, null, null, 480, null);
        }
        if (any instanceof ImageWrapper) {
            return drawImageWrapper(canvas, (ImageWrapper) any, drawX, drawY, onlyDecodeBound);
        }
        if (any instanceof DataItemImageNumber) {
            return drawDataItemImageNumber(canvas, (DataItemImageNumber) any, drawX, drawY, onlyDecodeBound);
        }
        if (any instanceof DataItemPointer) {
            return drawDataItemPointer(canvas, (DataItemPointer) any, drawX, drawY, onlyDecodeBound);
        }
        if (any instanceof DataItemImageValues) {
            return drawDataItemImageValues(canvas, (DataItemImageValues) any, drawX, drawY, onlyDecodeBound);
        }
        if (any instanceof CustomWidget) {
            if (!onlyDecodeBound) {
                drawCustomWidget$default(this, canvas, (CustomWidget) any, drawX, drawY, null, false, false, 112, null);
            }
            CustomWidget customWidget = (CustomWidget) any;
            Float width = customWidget.getWidth();
            int iFloatValue = width != null ? (int) width.floatValue() : 0;
            Float height = customWidget.getHeight();
            int iFloatValue2 = height != null ? (int) height.floatValue() : 0;
            Float width2 = customWidget.getWidth();
            int iFloatValue3 = width2 != null ? (int) width2.floatValue() : 0;
            Float height2 = customWidget.getHeight();
            return new DecodeBoundItem(iFloatValue, iFloatValue2, iFloatValue3, height2 != null ? (int) height2.floatValue() : 0);
        }
        if (any instanceof Slot) {
            if (!onlyDecodeBound) {
                drawSlot(canvas, (Slot) any, drawX, drawY);
            }
        } else {
            if (any instanceof DataItemArcProgressBar) {
                if (!onlyDecodeBound) {
                    drawDataItemArcProgressBar(canvas, (DataItemArcProgressBar) any, drawX, drawY);
                }
                return null;
            }
            if (any instanceof DataItemLineProgressBar) {
                if (!onlyDecodeBound) {
                    drawDataItemLineProgressBar(canvas, (DataItemLineProgressBar) any, drawX, drawY);
                }
                return null;
            }
            if (any instanceof ResourceFile) {
                if (!onlyDecodeBound) {
                    drawFile(canvas, (ResourceFile) any, drawX, drawY);
                }
            } else if (any instanceof DataItemText) {
                if (!onlyDecodeBound) {
                    drawDataItemText(canvas, (DataItemText) any, drawX, drawY);
                }
            } else if ((any instanceof Sprite) && !onlyDecodeBound) {
                drawSprite(canvas, (Sprite) any, drawX, drawY);
            }
        }
        return null;
    }

    public static /* synthetic */ DecodeBoundItem drawAny$default(WatchFaceView watchFaceView, Object obj, Canvas canvas, float f, float f2, boolean z, int i, Object obj2) {
        if ((i & 16) != 0) {
            z = false;
        }
        return watchFaceView.drawAny(obj, canvas, f, f2, z);
    }

    private final void drawArcIndicatorImageIfNeed(DataItemArcProgressBar item, float centerX, float centerY, float angleStart, float sweepAngle, Canvas canvas) {
        Image imageExpectGetImageByRefKey;
        String src;
        String indicatorImage = item.getIndicatorImage();
        if (indicatorImage == null || (imageExpectGetImageByRefKey = expectGetImageByRefKey(indicatorImage)) == null || (src = imageExpectGetImageByRefKey.getSrc()) == null || StringsKt__StringsKt.isBlank(src)) {
            return;
        }
        float indicatorRadius = item.getIndicatorRadius();
        if (indicatorRadius < 0.0f) {
            indicatorRadius = item.getBarRadius();
        }
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        String str = this.mFilePath;
        Intrinsics.checkNotNull(str);
        File file = new File(dialFileUtils.getDialResourceFilePath(str), imageExpectGetImageByRefKey.getSrc());
        if (file.exists()) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            Matrix matrix = new Matrix();
            matrix.postTranslate(-(centerX - (centerX - (width / 2.0f))), -(centerY - (centerY - (indicatorRadius + (height / 2.0f)))));
            float f = angleStart + sweepAngle;
            Logger.i(TAG, "indicator rotate " + f);
            matrix.postRotate(f);
            matrix.postTranslate(centerX, centerY);
            canvas.drawBitmap(bitmapDecodeFile, matrix, this.bitmapPaint);
        }
    }

    private final void drawBgIfNeed(Canvas canvas) {
        Theme theme = this.mTheme;
        String bgColor = null;
        String bg = theme != null ? theme.getBg() : null;
        if (bg != null && !StringsKt__StringsKt.isBlank(bg)) {
            Theme theme2 = this.mTheme;
            Intrinsics.checkNotNull(theme2);
            String bg2 = theme2.getBg();
            Intrinsics.checkNotNull(bg2);
            drawLayout(canvas, new Layout(bg2, 0.0f, 0.0f, null, 8, null));
            return;
        }
        Theme theme3 = this.mTheme;
        String bgColor2 = theme3 != null ? theme3.getBgColor() : null;
        if (bgColor2 == null || StringsKt__StringsKt.isBlank(bgColor2)) {
            bgColor = "#000000";
        } else {
            Theme theme4 = this.mTheme;
            if (theme4 != null) {
                bgColor = theme4.getBgColor();
            }
        }
        drawImage$default(this, canvas, new Image(null, null, false, null, bgColor, null, 47, null), 0.0f, 0.0f, false, null, null, null, null, 496, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    private final void drawCustomWidget(Canvas canvas, CustomWidget widget, float drawX, float drawY, String slotType, boolean showEditBox, boolean needScale) {
        Map<String, ? extends Object> map;
        Map<String, ? extends Object> map2;
        String preview = widget.getPreview();
        Object obj = (preview == null || StringsKt__StringsKt.isBlank(preview) || (map2 = this.mResourceMap) == null) ? null : map2.get(preview);
        float f = this.editScale;
        if (showEditBox) {
            String editBox = widget.getEditBox();
            Object obj2 = (editBox == null || StringsKt__StringsKt.isBlank(editBox) || (map = this.mResourceMap) == null) ? null : map.get(editBox);
            if (obj2 instanceof Image) {
                Image image = (Image) obj2;
                float f2 = this.editScale;
                drawImage$default(this, canvas, image, drawX - (f2 * 3.0f), drawY - (f2 * 3.0f), false, needScale ? Float.valueOf(f) : null, new RecolorCustom(true, "#FF612E"), null, null, 400, null);
            }
        }
        boolean z = slotType != null && Intrinsics.areEqual(slotType, "widget");
        if (showEditBox && z && (obj instanceof Image)) {
            Image image2 = (Image) obj;
            float f3 = this.editScale;
            drawImage$default(this, canvas, image2, drawX - (f3 * 3.0f), drawY - (f3 * 3.0f), false, needScale ? Float.valueOf(f) : null, null, null, null, 464, null);
            return;
        }
        List<WidgetItem> widgetItemList = widget.getWidgetItemList();
        if (widgetItemList == null) {
            return;
        }
        String flexDirection = widget.getFlexDirection();
        if (Intrinsics.areEqual("row", flexDirection) || Intrinsics.areEqual("column", flexDirection)) {
            drawFlexBoxWidgetList(canvas, widget, drawX, drawY, widgetItemList);
            return;
        }
        for (WidgetItem widgetItem : widgetItemList) {
            String ref = widgetItem.getRef();
            if (ref != null) {
                Map<String, ? extends Object> map3 = this.mResourceMap;
                if ((map3 != null ? map3.get(ref) : null) != null) {
                    Map<String, ? extends Object> map4 = this.mResourceMap;
                    Object obj3 = map4 != null ? map4.get(ref) : null;
                    Intrinsics.checkNotNull(obj3);
                    drawAny$default(this, obj3, canvas, drawX + widgetItem.getX(), drawY + widgetItem.getY(), false, 16, null);
                }
            }
        }
    }

    public static /* synthetic */ void drawCustomWidget$default(WatchFaceView watchFaceView, Canvas canvas, CustomWidget customWidget, float f, float f2, String str, boolean z, boolean z2, int i, Object obj) {
        watchFaceView.drawCustomWidget(canvas, customWidget, f, f2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    private final void drawDataItemArcProgressBar(Canvas canvas, DataItemArcProgressBar item, float drawX, float drawY) {
        String ref;
        String src;
        Image imageExpectGetImageByRefKey;
        String source;
        if ((Intrinsics.areEqual(item.getRenderRule(), "hideWhenUnitMismatch") && (source = item.getSource()) != null && StringsKt__StringsKt.contains((CharSequence) source, (CharSequence) "Fahrenheit", true)) || (ref = item.getRef()) == null) {
            return;
        }
        String bg = item.getBg();
        if (bg != null && (imageExpectGetImageByRefKey = expectGetImageByRefKey(bg)) != null) {
            drawImage$default(this, canvas, imageExpectGetImageByRefKey, drawX, drawY, false, null, null, null, null, 496, null);
        }
        Image imageExpectGetImageByRefKey2 = expectGetImageByRefKey(ref);
        if (imageExpectGetImageByRefKey2 == null || (src = imageExpectGetImageByRefKey2.getSrc()) == null || StringsKt__StringsKt.isBlank(src)) {
            return;
        }
        float barRadius = item.getBarRadius();
        float barWidth = item.getBarWidth();
        float pivotX = drawX + item.getPivotX();
        float pivotY = drawY + item.getPivotY();
        float f = pivotX - barRadius;
        float f2 = pivotX + barRadius;
        float f3 = pivotY - barRadius;
        float f4 = pivotY + barRadius;
        RectF rectF = new RectF(f, f3, f2, f4);
        float f5 = barWidth / 2.0f;
        RectF rectF2 = new RectF(f - f5, f3 - f5, f2 + f5, f4 + f5);
        float angleStart = item.getAngleStart();
        float angleRange = item.getAngleRange();
        float valueRange = item.getValueRange();
        float valueStart = item.getValueStart();
        float fFloatValue = DialSourceUtilsKt.getSourceDefaultValue(item.getSource()).floatValue();
        if (item.getValueUesSourceEnable()) {
            valueRange -= valueStart;
        }
        Logger.d(TAG, "drawArc name " + item.getName() + ":angleStart:" + angleStart + ";angleRange:" + angleRange + ";valueStart:" + valueStart + ";valueRange:" + valueRange + ";source=" + item.getSource() + ";defaultValue=" + fFloatValue + ";indicatorRadius=" + item.getIndicatorRadius());
        if (((int) valueRange) == 0) {
            return;
        }
        float f6 = (-90) + angleStart;
        float f7 = valueStart + valueRange;
        if (fFloatValue > f7) {
            fFloatValue = f7;
        }
        if (fFloatValue < valueStart) {
            Logger.d(TAG, "arc value out of range " + item.getName() + ";" + fFloatValue + ";(" + valueStart + "-" + f7 + ")");
            return;
        }
        float f8 = angleRange / valueRange;
        float f9 = f8 * (fFloatValue - valueStart);
        Logger.d(TAG, "drawArc avg " + f8 + ";startAngle " + f6 + ";sweepAngle " + f9);
        if (Intrinsics.areEqual(item.getRenderRule(), "hideWhenOutRange") && ((angleRange > 0.0f && f9 > angleRange) || (angleRange < 0.0f && f9 < angleRange))) {
            Logger.d(TAG, "arc hideWhenOutRange " + item.getName());
            return;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(barWidth);
        paint.setStrokeCap(Intrinsics.areEqual(item.getEndingStyle(), "round") ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        paint.setColor(Color.parseColor("#000000"));
        int iSaveLayer = canvas.saveLayer(rectF2, null);
        drawImage$default(this, canvas, imageExpectGetImageByRefKey2, drawX, drawY, false, null, null, null, null, 496, null);
        DialWatchFace dialWatchFace = this.mWatchFace;
        Intrinsics.checkNotNull(dialWatchFace);
        int width = (int) dialWatchFace.getWidth();
        DialWatchFace dialWatchFace2 = this.mWatchFace;
        Intrinsics.checkNotNull(dialWatchFace2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, (int) dialWatchFace2.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.setHasAlpha(true);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas2.drawArc(rectF, f6, f9, false, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        canvas.restoreToCount(iSaveLayer);
        drawArcIndicatorImageIfNeed(item, pivotX, pivotY, angleStart, f9, canvas);
    }

    private final DecodeBoundItem drawDataItemImageNumber(Canvas canvas, DataItemImageNumber imageNumber, float x, float y, boolean onlyDecodeBound) {
        String source;
        ImageArray imageArrayExpectGetImageArrayByRefKey = expectGetImageArrayByRefKey(imageNumber.getRef());
        if (imageArrayExpectGetImageArrayByRefKey == null) {
            return null;
        }
        if (Intrinsics.areEqual(imageNumber.getRenderRule(), "hideWhenUnitMismatch") && (source = imageNumber.getSource()) != null && StringsKt__StringsKt.contains((CharSequence) source, (CharSequence) "Fahrenheit", true)) {
            return null;
        }
        String source2 = imageNumber.getSource();
        int totalDigits = imageNumber.getTotalDigits();
        Boolean leadingZero = imageNumber.getLeadingZero();
        boolean zBooleanValue = leadingZero != null ? leadingZero.booleanValue() : false;
        Boolean trailingZero = imageNumber.getTrailingZero();
        Integer[] imageNumberDefaultArray = DialSourceUtilsKt.getImageNumberDefaultArray(source2, totalDigits, zBooleanValue, trailingZero != null ? trailingZero.booleanValue() : false);
        List<Image> imageList = imageArrayExpectGetImageArrayByRefKey.getImageList();
        Intrinsics.checkNotNull(imageList);
        List<Image> imageNumberFileList = DialSourceUtilsKt.getImageNumberFileList(imageNumberDefaultArray, imageList, expectGetImageByRefKey(imageNumber.getUnitIcon()));
        if (imageNumberFileList == null) {
            return null;
        }
        return drawImageNumberByArray(canvas, x, y, imageNumberFileList, imageNumber, onlyDecodeBound, imageArrayExpectGetImageArrayByRefKey.getRecolorEnable());
    }

    public static /* synthetic */ DecodeBoundItem drawDataItemImageNumber$default(WatchFaceView watchFaceView, Canvas canvas, DataItemImageNumber dataItemImageNumber, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return watchFaceView.drawDataItemImageNumber(canvas, dataItemImageNumber, f, f2, z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    private final DecodeBoundItem drawDataItemImageValues(Canvas canvas, DataItemImageValues imageValues, float x, float y, boolean onlyDecodeBound) {
        List<Image> imageList;
        RecolorCustom recolorCustom;
        Integer numValueOf;
        List<String> listEmptyList;
        ImageArray imageArrayExpectGetImageArrayByRefKey = expectGetImageArrayByRefKey(imageValues.getRef());
        if (imageArrayExpectGetImageArrayByRefKey != null && (imageList = imageArrayExpectGetImageArrayByRefKey.getImageList()) != null && !imageList.isEmpty()) {
            if (imageArrayExpectGetImageArrayByRefKey.getRecolorEnable()) {
                DialWatchFace dialWatchFace = this.mWatchFace;
                if (dialWatchFace == null || (listEmptyList = dialWatchFace.getRecolorTable()) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                Theme theme = this.mTheme;
                Intrinsics.checkNotNull(theme);
                DialEditEntity dialEditEntity = theme.getDialEditEntity();
                Intrinsics.checkNotNull(dialEditEntity);
                int recolorIndex = dialEditEntity.getRecolorIndex();
                List<String> list = listEmptyList;
                if (!(!list.isEmpty()) || recolorIndex < 0 || recolorIndex >= list.size()) {
                    recolorCustom = null;
                } else {
                    recolorCustom = new RecolorCustom(true, listEmptyList.get(recolorIndex));
                }
            } else {
                recolorCustom = null;
            }
            Number sourceDefaultValue = DialSourceUtilsKt.getSourceDefaultValue(imageValues.getSource());
            int iIntValue = sourceDefaultValue instanceof Integer ? sourceDefaultValue.intValue() : 0;
            List<Param> paramList = imageValues.getParamList();
            Float rotation = imageValues.getRotation();
            float fFloatValue = rotation != null ? rotation.floatValue() : 0.0f;
            List<Param> list2 = paramList;
            if (list2 != null && !list2.isEmpty()) {
                int size = list2.size();
                Param param = null;
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    String value = paramList.get(i2).getValue();
                    if (!Intrinsics.areEqual(value, "INT_MAX")) {
                        if (value != null) {
                            try {
                                numValueOf = Integer.valueOf(Integer.parseInt(value));
                            } catch (Exception unused) {
                                numValueOf = null;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null && numValueOf.intValue() <= iIntValue) {
                            param = paramList.get(i2);
                            i = i2;
                        }
                    }
                }
                if (i >= 0 && i < imageArrayExpectGetImageArrayByRefKey.getImageList().size() && param != null) {
                    return drawImage$default(this, canvas, imageArrayExpectGetImageArrayByRefKey.getImageList().get(i), x + param.getOffsetX(), y + param.getOffsetY(), onlyDecodeBound, null, recolorCustom, Float.valueOf(fFloatValue), null, 288, null);
                }
            } else if (iIntValue >= 0 && iIntValue < imageArrayExpectGetImageArrayByRefKey.getImageList().size()) {
                return drawImage$default(this, canvas, imageArrayExpectGetImageArrayByRefKey.getImageList().get(iIntValue), x, y, onlyDecodeBound, null, recolorCustom, Float.valueOf(fFloatValue), null, 288, null);
            }
        }
        return null;
    }

    public static /* synthetic */ DecodeBoundItem drawDataItemImageValues$default(WatchFaceView watchFaceView, Canvas canvas, DataItemImageValues dataItemImageValues, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return watchFaceView.drawDataItemImageValues(canvas, dataItemImageValues, f, f2, z);
    }

    private final void drawDataItemLineProgressBar(Canvas canvas, DataItemLineProgressBar item, float drawX, float drawY) {
        String src;
        RectF rectF;
        boolean z;
        boolean z2;
        RectF rectF2;
        Image imageExpectGetImageByRefKey;
        String ref = item.getRef();
        if (ref == null) {
            return;
        }
        String bg = item.getBg();
        if (bg != null && (imageExpectGetImageByRefKey = expectGetImageByRefKey(bg)) != null) {
            drawImage$default(this, canvas, imageExpectGetImageByRefKey, drawX, drawY, false, null, null, null, null, 496, null);
        }
        Image imageExpectGetImageByRefKey2 = expectGetImageByRefKey(ref);
        if (imageExpectGetImageByRefKey2 == null || (src = imageExpectGetImageByRefKey2.getSrc()) == null || StringsKt__StringsKt.isBlank(src)) {
            return;
        }
        float barWidth = item.getBarWidth();
        boolean z3 = item.getStartX() == item.getEndX();
        if (z3) {
            float f = barWidth / 2.0f;
            rectF = new RectF((drawX + item.getStartX()) - f, drawY + item.getStartY(), drawX + item.getStartX() + f, drawY + item.getEndY());
        } else {
            float f2 = barWidth / 2.0f;
            rectF = new RectF(drawX + item.getStartX(), (drawY + item.getStartY()) - f2, drawX + item.getEndX(), drawY + item.getStartY() + f2);
        }
        RectF rectF3 = rectF;
        float f3 = rectF3.top;
        float f4 = rectF3.bottom;
        if (f3 > f4) {
            rectF3.set(rectF3.left, f4, rectF3.right, f3);
            z = true;
        } else {
            z = false;
        }
        float f5 = rectF3.left;
        float f6 = rectF3.right;
        if (f5 > f6) {
            rectF3.set(f6, rectF3.top, f5, rectF3.bottom);
            z2 = true;
        } else {
            z2 = false;
        }
        float valueRange = item.getValueRange();
        float valueStart = item.getValueStart();
        float fFloatValue = DialSourceUtilsKt.getSourceDefaultValue(item.getSource()).floatValue();
        if (item.getValueUesSourceEnable()) {
            valueRange -= valueStart;
        }
        if (((int) valueRange) == 0) {
            return;
        }
        float f7 = valueStart + valueRange;
        if (fFloatValue > f7) {
            fFloatValue = f7;
        }
        Logger.d(TAG, "drawLineBar name " + item.getName() + ";valueStart:" + valueStart + ";valueRange:" + valueRange + ";source=" + item.getSource() + ";defaultValue=" + fFloatValue);
        if (fFloatValue < valueStart) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(rectF3, null);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(barWidth);
        paint.setStrokeCap(Intrinsics.areEqual(item.getEndingStyle(), "round") ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        paint.setColor(Color.parseColor("#FF612E"));
        float f8 = (fFloatValue - valueStart) / valueRange;
        drawImage$default(this, canvas, imageExpectGetImageByRefKey2, drawX, drawY, false, null, null, null, null, 496, null);
        DialWatchFace dialWatchFace = this.mWatchFace;
        Intrinsics.checkNotNull(dialWatchFace);
        int width = (int) dialWatchFace.getWidth();
        DialWatchFace dialWatchFace2 = this.mWatchFace;
        Intrinsics.checkNotNull(dialWatchFace2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, (int) dialWatchFace2.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.setHasAlpha(true);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        if (z3) {
            rectF2 = new RectF(rectF3.left, !z ? rectF3.top : rectF3.bottom - (rectF3.height() * f8), rectF3.right, !z ? rectF3.top + (rectF3.height() * f8) : rectF3.bottom);
        } else {
            rectF2 = new RectF(!z2 ? rectF3.left : rectF3.right - (rectF3.height() * f8), rectF3.top, !z2 ? rectF3.left + (rectF3.width() * f8) : rectF3.right, rectF3.bottom);
        }
        canvas2.drawRect(rectF2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        canvas.restoreToCount(iSaveLayer);
    }

    private final DecodeBoundItem drawDataItemPointer(Canvas canvas, DataItemPointer any, float drawX, float drawY, boolean onlyDecodeBound) {
        String src;
        List<String> listEmptyList;
        Integer numSafeColorParse;
        Map<String, ? extends Object> map = this.mResourceMap;
        Image imageExpectGetImage = expectGetImage(map != null ? map.get(any.getRef()) : null);
        if (imageExpectGetImage != null && (src = imageExpectGetImage.getSrc()) != null && !StringsKt__StringsKt.isBlank(src)) {
            DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
            String str = this.mFilePath;
            Intrinsics.checkNotNull(str);
            File file = new File(dialFileUtils.getDialResourceFilePath(str), imageExpectGetImage.getSrc());
            DecodeBoundItem decodeBoundItemDecodeImageWidthHeight = decodeImageWidthHeight(file);
            if (onlyDecodeBound) {
                return decodeBoundItemDecodeImageWidthHeight;
            }
            float pivotX = any.getPivotX();
            float pivotY = any.getPivotY();
            float f = drawX + pivotX;
            float f2 = drawY + pivotY;
            float angleStart = any.getAngleStart();
            float angleRange = any.getAngleRange();
            float valueRange = any.getValueRange();
            float valueStart = any.getValueStart();
            if (any.getValueUesSourceEnable()) {
                valueRange -= valueStart;
            }
            if (((int) valueRange) == 0) {
                return decodeBoundItemDecodeImageWidthHeight;
            }
            float fFloatValue = DialSourceUtilsKt.getDataItemPointerValueDefault(any.getSource()).floatValue();
            if (fFloatValue < valueStart || fFloatValue > valueStart + valueRange) {
                Logger.d(TAG, "pointer value out of range " + any.getName() + ";" + fFloatValue + ";(" + valueStart + "-" + (valueRange + valueStart) + ")");
                return decodeBoundItemDecodeImageWidthHeight;
            }
            float f3 = (angleRange / valueRange) * (fFloatValue - valueStart);
            String renderRule = any.getRenderRule();
            Logger.d(TAG, "drawDataItemPointer " + any.getName() + ";source=" + any.getSource() + " value " + fFloatValue + ";sweep:" + f3 + ";angleStart:" + angleStart + ";angleRange:" + angleRange + ";valueStart" + valueStart + ";valueRange" + valueRange + ";rule " + renderRule + ";  ");
            if (Intrinsics.areEqual(renderRule, "hideWhenOutRange") && ((angleRange > 0.0f && f3 > angleRange) || (angleRange < 0.0f && f3 < angleRange))) {
                Logger.d(TAG, "pointer hideWhenOutRange " + any.getName());
                return decodeBoundItemDecodeImageWidthHeight;
            }
            Matrix matrix = new Matrix();
            matrix.postTranslate(-pivotX, -pivotY);
            matrix.postRotate(angleStart + f3);
            matrix.postTranslate(f, f2);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
            DialWatchFace dialWatchFace = this.mWatchFace;
            if (dialWatchFace == null || (listEmptyList = dialWatchFace.getRecolorTable()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            Theme theme = this.mTheme;
            Intrinsics.checkNotNull(theme);
            DialEditEntity dialEditEntity = theme.getDialEditEntity();
            Intrinsics.checkNotNull(dialEditEntity);
            int recolorIndex = dialEditEntity.getRecolorIndex();
            if (imageExpectGetImage.getRecolorEnable()) {
                List<String> list = listEmptyList;
                if ((!list.isEmpty()) && recolorIndex >= 0 && recolorIndex < list.size() && (numSafeColorParse = DialEditHelper.INSTANCE.safeColorParse(listEmptyList.get(recolorIndex))) != null) {
                    this.bitmapPaint.setColorFilter(new PorterDuffColorFilter(numSafeColorParse.intValue(), PorterDuff.Mode.SRC_IN));
                }
            }
            canvas.drawBitmap(bitmapDecodeFile, matrix, this.bitmapPaint);
            this.bitmapPaint.setColorFilter(null);
            matrix.reset();
            return decodeBoundItemDecodeImageWidthHeight;
        }
        return null;
    }

    public static /* synthetic */ DecodeBoundItem drawDataItemPointer$default(WatchFaceView watchFaceView, Canvas canvas, DataItemPointer dataItemPointer, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return watchFaceView.drawDataItemPointer(canvas, dataItemPointer, f, f2, z);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0355  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    private final void drawDataItemText(Canvas canvas, DataItemText any, float drawX, float drawY) {
        int show;
        Typeface textTypeFace;
        List<String> listListOf;
        List<Integer> listEmptyList;
        List<String> textList;
        android.text.Layout.Alignment alignment;
        float width;
        int i = 0;
        boolean z = any.getLiteralNum() != 0;
        String textStr = any.getTextStr();
        String str = "";
        if (textStr == null) {
            textStr = "";
        }
        List<TextContent> sourceList = any.getSourceList();
        if (sourceList == null) {
            sourceList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (StringsKt__StringsKt.isBlank(textStr) && sourceList.isEmpty()) {
            return;
        }
        if (z) {
            Theme theme = this.mTheme;
            Intrinsics.checkNotNull(theme);
            DialEditEntity dialEditEntity = theme.getDialEditEntity();
            Object obj = null;
            List<FaceEditLiteralBean> textItemList = dialEditEntity != null ? dialEditEntity.getTextItemList() : null;
            if (textItemList != null) {
                for (Object obj2 : textItemList) {
                    if (Intrinsics.areEqual(((FaceEditLiteralBean) obj2).getName(), any.getName())) {
                        obj = obj2;
                        break;
                    }
                }
                FaceEditLiteralBean faceEditLiteralBean = (FaceEditLiteralBean) obj;
                if (faceEditLiteralBean != null) {
                    show = faceEditLiteralBean.getShow();
                } else {
                    show = 0;
                }
            } else {
                show = 0;
            }
            DialWatchFace dialWatchFace = this.mWatchFace;
            if (dialWatchFace != null && (textList = dialWatchFace.getTextList()) != null) {
                if (show < 0) {
                    show = 0;
                }
                String str2 = (String) CollectionsKt___CollectionsKt.getOrNull(textList, show);
                if (str2 != null) {
                    str = str2;
                }
            }
            TextPaint textPaint = this.textPaint;
            String literalWholeFont = any.getLiteralWholeFont();
            if (literalWholeFont == null || literalWholeFont.length() == 0) {
                textTypeFace = getTextTypeFace(any.getFontId(), any.getFontWeight());
            } else {
                DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
                String str3 = this.mFilePath;
                Intrinsics.checkNotNull(str3);
                textTypeFace = Typeface.createFromFile(new File(dialFileUtils.getDialResourceFilePath(str3), any.getLiteralWholeFont()));
            }
            textPaint.setTypeface(textTypeFace);
            listListOf = CollectionsKt__CollectionsJVMKt.listOf(str);
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            Pair<List<String>, List<Integer>> textAndColorStrList = getTextAndColorStrList(textStr, sourceList);
            listListOf = textAndColorStrList.getFirst();
            listEmptyList = textAndColorStrList.getSecond();
            this.textPaint.setTypeface(getTextTypeFace(any.getFontId(), any.getFontWeight()));
        }
        List<Integer> list = listEmptyList;
        Logger.d(TAG, "drawDataItemText " + any.getName() + ";strList " + listListOf + ";colorList " + list);
        if (listListOf.isEmpty()) {
            return;
        }
        this.textPaint.setTextSize(any.getFontSize());
        this.textPaint.setLetterSpacing(0.08f);
        Integer numSafeColorParse = DialEditHelper.INSTANCE.safeColorParse(any.getColor());
        int iIntValue = numSafeColorParse != null ? numSafeColorParse.intValue() : -1;
        this.textPaint.setColor(iIntValue);
        this.textPaint.setStyle(Paint.Style.FILL);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        Logger.d(TAG, "textHeight " + f + " fontSize " + any.getFontSize() + " ascent " + this.textPaint.ascent() + " descent " + this.textPaint.descent());
        float radius = any.getRadius() + f;
        String style = any.getStyle();
        if (style == null) {
            style = "normal";
        }
        if (Intrinsics.areEqual(style, "arc")) {
            float f2 = drawX + radius;
            float f3 = drawY + radius;
            RectF rectF = new RectF(f2 - radius, f3 - radius, f2 + radius, f3 + radius);
            float startAngle = (-90) + any.getStartAngle();
            Path path = new Path();
            path.addArc(rectF, startAngle, any.getSpan());
            float f4 = -(any.getSpan() >= 0.0f ? this.textPaint.ascent() : this.textPaint.descent());
            float fAbs = (float) (((double) radius) * 6.283185307179586d * ((double) (Math.abs(any.getSpan()) / SpatialRelationUtil.A_CIRCLE_DEGREE)));
            List<String> list2 = listListOf;
            Iterator<T> it = list2.iterator();
            float fMeasureText = 0.0f;
            while (it.hasNext()) {
                fMeasureText += this.textPaint.measureText((String) it.next());
            }
            String align = any.getAlign();
            float fMeasureText2 = Intrinsics.areEqual(align, "center") ? (fAbs - fMeasureText) / 2 : Intrinsics.areEqual(align, TSMAuthContants.PARAM_KEY_RIGHT) ? fAbs - fMeasureText : 0.0f;
            for (Object obj3 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str4 = (String) obj3;
                List<Integer> list3 = list;
                if (!(!list3.isEmpty()) || i < 0 || i >= list3.size()) {
                    this.textPaint.setColor(iIntValue);
                } else {
                    this.textPaint.setColor(list.get(i).intValue());
                }
                canvas.drawTextOnPath(str4, path, fMeasureText2, f4, this.textPaint);
                fMeasureText2 += this.textPaint.measureText(str4);
                i = i2;
            }
            return;
        }
        this.textPaint.setTextAlign(Paint.Align.LEFT);
        if (listListOf.size() != 1) {
            List<String> list4 = listListOf;
            Iterator<T> it2 = list4.iterator();
            float fMeasureText3 = 0.0f;
            while (it2.hasNext()) {
                fMeasureText3 += this.textPaint.measureText((String) it2.next());
            }
            String align2 = any.getAlign();
            float width2 = Intrinsics.areEqual(align2, TSMAuthContants.PARAM_KEY_RIGHT) ? (drawX + any.getWidth()) - fMeasureText3 : Intrinsics.areEqual(align2, "center") ? drawX + ((any.getWidth() - fMeasureText3) / 2.0f) : drawX;
            float fAscent = drawY - this.textPaint.ascent();
            for (Object obj4 : list4) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str5 = (String) obj4;
                List<Integer> list5 = list;
                if (!(!list5.isEmpty()) || i < 0 || i >= list5.size()) {
                    this.textPaint.setColor(iIntValue);
                } else {
                    this.textPaint.setColor(list.get(i).intValue());
                }
                canvas.drawText(str5, width2, fAscent, this.textPaint);
                width2 += this.textPaint.measureText(str5);
                i = i3;
            }
            return;
        }
        boolean zIsRTLDirection = AppUtil.isRTLDirection();
        String align3 = any.getAlign();
        if (Intrinsics.areEqual(align3, "left")) {
            alignment = zIsRTLDirection ? android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (Intrinsics.areEqual(align3, TSMAuthContants.PARAM_KEY_RIGHT)) {
            alignment = zIsRTLDirection ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        }
        String str6 = listListOf.get(0);
        this.textPaint.setLetterSpacing(any.getLetterSpace());
        Iterator<T> it3 = listListOf.iterator();
        float fMeasureText4 = 0.0f;
        while (it3.hasNext()) {
            fMeasureText4 += this.textPaint.measureText((String) it3.next());
        }
        String strCustomLineBreak = customLineBreak(str6, (int) any.getWidth(), this.textPaint);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(strCustomLineBreak, 0, strCustomLineBreak.length(), this.textPaint, (int) (fMeasureText4 > any.getWidth() ? any.getWidth() : fMeasureText4)).setLineSpacing(any.getLineSpace(), 1.0f).setAlignment(alignment).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        int lineCount = staticLayoutBuild.getLineCount();
        if (lineCount > 1) {
            width = drawX;
        } else if (Intrinsics.areEqual(any.getAlign(), TSMAuthContants.PARAM_KEY_RIGHT)) {
            width = (drawX + any.getWidth()) - fMeasureText4;
        } else if (Intrinsics.areEqual(any.getAlign(), "center")) {
            width = drawX + ((any.getWidth() - fMeasureText4) / 2.0f);
        } else {
            width = drawX;
        }
        if (!Intrinsics.areEqual(any.getLongMode(), "wrap") && lineCount > 1) {
            String strSubstring = str6.substring(0, staticLayoutBuild.getLineEnd(0));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            canvas.drawText(strSubstring, width, drawY - this.textPaint.ascent(), this.textPaint);
        } else {
            canvas.save();
            canvas.translate(width, drawY);
            staticLayoutBuild.draw(canvas);
            canvas.restore();
        }
    }

    private final void drawFgIfNeed(Canvas canvas) {
        Theme theme = this.mTheme;
        String fg = theme != null ? theme.getFg() : null;
        if (fg == null || StringsKt__StringsKt.isBlank(fg)) {
            return;
        }
        Theme theme2 = this.mTheme;
        Intrinsics.checkNotNull(theme2);
        String fg2 = theme2.getFg();
        Intrinsics.checkNotNull(fg2);
        drawLayout(canvas, new Layout(fg2, 0.0f, 0.0f, null, 8, null));
    }

    private final void drawFile(Canvas canvas, ResourceFile item, float drawX, float drawY) {
        Map<String, ? extends Object> map;
        Object obj;
        Object obj2;
        String fileName = item.getFileName();
        if (fileName == null || fileName.length() == 0) {
            return;
        }
        if (StringsKt__StringsJVMKt.endsWith$default(item.getFileName(), "ttf", false, 2, null)) {
            return;
        }
        String preview = item.getPreview();
        Theme theme = this.mTheme;
        String preview2 = theme != null ? theme.getPreview() : null;
        if (preview != null && preview.length() != 0) {
            Map<String, ? extends Object> map2 = this.mResourceMap;
            if (map2 == null || (obj2 = map2.get(preview)) == null) {
                return;
            }
            drawAny$default(this, obj2, canvas, drawX, drawY, false, 16, null);
            return;
        }
        if (preview2 == null || preview2.length() == 0 || (map = this.mResourceMap) == null || (obj = map.get(preview2)) == null) {
            return;
        }
        drawAny$default(this, obj, canvas, drawX, drawY, false, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    private final void drawFlexBoxWidgetList(Canvas canvas, CustomWidget widget, float drawX, float drawY, List<WidgetItem> widgetItemList) {
        List<DecodeBoundItem> list;
        float fFloatValue;
        List<DecodeBoundItem> list2;
        float f;
        float maxHeight;
        float f2;
        String ref;
        Map<String, ? extends Object> map;
        Object obj;
        Map<String, ? extends Object> map2;
        Object obj2;
        if (widgetItemList.isEmpty()) {
            return;
        }
        String flexDirection = widget.getFlexDirection();
        boolean zAreEqual = Intrinsics.areEqual("row", flexDirection);
        boolean zAreEqual2 = Intrinsics.areEqual("column", flexDirection);
        List<DecodeBoundItem> widgetListWidthHeight = getWidgetListWidthHeight(canvas, widgetItemList);
        Logger.d(TAG, "drawFlexBoxWidgetList pair " + widgetListWidthHeight + " " + widgetItemList.size() + "- " + widgetListWidthHeight.size());
        int i = 0;
        if (zAreEqual) {
            Float width = widget.getWidth();
            float fFloatValue2 = width != null ? width.floatValue() : 0.0f;
            if (fFloatValue2 <= 0.0f) {
                return;
            }
            Float alignGap = widget.getAlignGap();
            float fFloatValue3 = alignGap != null ? alignGap.floatValue() : 0.0f;
            List<DecodeBoundItem> list3 = widgetListWidthHeight;
            int i2 = 0;
            float sumWidth = 0.0f;
            for (Object obj3 : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DecodeBoundItem decodeBoundItem = (DecodeBoundItem) obj3;
                if (decodeBoundItem != null && decodeBoundItem.getSumWidth() > 0) {
                    sumWidth += decodeBoundItem.getSumWidth() + fFloatValue3;
                }
                i2 = i3;
            }
            if (sumWidth <= 0.0f) {
                return;
            }
            Iterator it = list3.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            DecodeBoundItem decodeBoundItem2 = (DecodeBoundItem) it.next();
            int maxHeight2 = decodeBoundItem2 != null ? decodeBoundItem2.getMaxHeight() : 0;
            while (it.hasNext()) {
                DecodeBoundItem decodeBoundItem3 = (DecodeBoundItem) it.next();
                int maxHeight3 = decodeBoundItem3 != null ? decodeBoundItem3.getMaxHeight() : 0;
                if (maxHeight2 < maxHeight3) {
                    maxHeight2 = maxHeight3;
                }
                it = it;
            }
            List<DecodeBoundItem> list4 = widgetListWidthHeight;
            Logger.d(TAG, "flexBox sumWidth:" + fFloatValue2 + ";child " + sumWidth + " " + widget.getJustifyContent() + " drawX " + drawX + " gap " + fFloatValue3 + " maxHeight" + maxHeight2);
            String justifyContent = widget.getJustifyContent();
            float f3 = Intrinsics.areEqual(justifyContent, "flex-end") ? ((fFloatValue2 + drawX) - sumWidth) + fFloatValue3 : Intrinsics.areEqual(justifyContent, "flex-start") ? drawX : (((fFloatValue2 - sumWidth) + fFloatValue3) / 2.0f) + drawX;
            Iterator<T> it2 = widgetItemList.iterator();
            float sumWidth2 = f3;
            while (true) {
                int i4 = i;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                i = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                WidgetItem widgetItem = (WidgetItem) next;
                if (i4 < 0 || i4 >= list4.size()) {
                    fFloatValue3 = fFloatValue3;
                    list2 = list4;
                } else {
                    list2 = list4;
                    DecodeBoundItem decodeBoundItem4 = list2.get(i4);
                    if (decodeBoundItem4 == null || (decodeBoundItem4.getSumWidth() == -1 && decodeBoundItem4.getSumHeight() == -1)) {
                        fFloatValue3 = fFloatValue3;
                    } else {
                        Float height = widget.getHeight();
                        float fFloatValue4 = height != null ? height.floatValue() : 0.0f;
                        String alignItems = widget.getAlignItems();
                        if (Intrinsics.areEqual(alignItems, "flex-end")) {
                            f = drawY + fFloatValue4;
                            maxHeight = decodeBoundItem4.getMaxHeight();
                        } else {
                            if (Intrinsics.areEqual(alignItems, "flex-start")) {
                                f2 = drawY;
                            } else {
                                f = drawY + (fFloatValue4 / 2.0f);
                                maxHeight = decodeBoundItem4.getMaxHeight() / 2.0f;
                            }
                            ref = widgetItem.getRef();
                            if (ref == null) {
                                map = this.mResourceMap;
                                if (map != null) {
                                    obj = map.get(ref);
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    map2 = this.mResourceMap;
                                    if (map2 != null) {
                                        obj2 = map2.get(ref);
                                    } else {
                                        obj2 = null;
                                    }
                                    Intrinsics.checkNotNull(obj2);
                                    drawAny$default(this, obj2, canvas, sumWidth2, f2, false, 16, null);
                                }
                            }
                            sumWidth2 += decodeBoundItem4.getSumWidth() + fFloatValue3;
                        }
                        f2 = f - maxHeight;
                        ref = widgetItem.getRef();
                        if (ref == null) {
                            map = this.mResourceMap;
                            if (map != null) {
                                obj = map.get(ref);
                            } else {
                                obj = null;
                            }
                            if (obj != null) {
                                map2 = this.mResourceMap;
                                if (map2 != null) {
                                    obj2 = map2.get(ref);
                                } else {
                                    obj2 = null;
                                }
                                Intrinsics.checkNotNull(obj2);
                                drawAny$default(this, obj2, canvas, sumWidth2, f2, false, 16, null);
                            }
                        }
                        sumWidth2 += decodeBoundItem4.getSumWidth() + fFloatValue3;
                    }
                }
                list4 = list2;
                fFloatValue3 = fFloatValue3;
            }
        } else {
            List<DecodeBoundItem> list5 = widgetListWidthHeight;
            if (!zAreEqual2) {
                return;
            }
            Float height2 = widget.getHeight();
            float fFloatValue5 = height2 != null ? height2.floatValue() : 0.0f;
            Float width2 = widget.getWidth();
            float fFloatValue6 = width2 != null ? width2.floatValue() : 0.0f;
            if (fFloatValue5 <= 0.0f || fFloatValue6 <= 0.0f) {
                return;
            }
            Float alignGap2 = widget.getAlignGap();
            float fFloatValue7 = alignGap2 != null ? alignGap2.floatValue() : 0.0f;
            List<DecodeBoundItem> list6 = list5;
            int i5 = 0;
            float maxHeight4 = 0.0f;
            for (Object obj4 : list6) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DecodeBoundItem decodeBoundItem5 = (DecodeBoundItem) obj4;
                if (decodeBoundItem5 != null && decodeBoundItem5.getSumWidth() > 0) {
                    maxHeight4 += decodeBoundItem5.getMaxHeight() + fFloatValue7;
                }
                list5 = list5;
                i5 = i6;
            }
            List<DecodeBoundItem> list7 = list5;
            if (maxHeight4 <= 0.0f) {
                return;
            }
            Iterator it3 = list6.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            DecodeBoundItem decodeBoundItem6 = (DecodeBoundItem) it3.next();
            int maxWidth = decodeBoundItem6 != null ? decodeBoundItem6.getMaxWidth() : 0;
            while (it3.hasNext()) {
                DecodeBoundItem decodeBoundItem7 = (DecodeBoundItem) it3.next();
                int maxWidth2 = decodeBoundItem7 != null ? decodeBoundItem7.getMaxWidth() : 0;
                if (maxWidth < maxWidth2) {
                    maxWidth = maxWidth2;
                }
                it3 = it3;
            }
            Logger.d(TAG, "flexBox sumWidth:" + fFloatValue6 + ";child " + maxHeight4 + " " + widget.getJustifyContent() + " drawX " + drawX + " gap " + fFloatValue7 + " maxWidth" + maxWidth);
            String justifyContent2 = widget.getJustifyContent();
            float f4 = Intrinsics.areEqual(justifyContent2, "flex-end") ? ((drawY + fFloatValue5) - maxHeight4) + fFloatValue7 : Intrinsics.areEqual(justifyContent2, "flex-start") ? drawY : drawY + (((fFloatValue5 - maxHeight4) + fFloatValue7) / 2.0f);
            Iterator<T> it4 = widgetItemList.iterator();
            float sumHeight = f4;
            while (true) {
                int i7 = i;
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                i = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                WidgetItem widgetItem2 = (WidgetItem) next2;
                if (i7 < 0 || i7 >= list7.size()) {
                    list = list7;
                } else {
                    list = list7;
                    DecodeBoundItem decodeBoundItem8 = list.get(i7);
                    if (decodeBoundItem8 != null && (decodeBoundItem8.getSumWidth() != -1 || decodeBoundItem8.getSumHeight() != -1)) {
                        String ref2 = widgetItem2.getRef();
                        if (ref2 != null) {
                            Map<String, ? extends Object> map3 = this.mResourceMap;
                            if ((map3 != null ? map3.get(ref2) : null) != null) {
                                Map<String, ? extends Object> map4 = this.mResourceMap;
                                Object obj5 = map4 != null ? map4.get(ref2) : null;
                                Intrinsics.checkNotNull(obj5);
                                if (Intrinsics.areEqual(widget.getAlignContent(), "center") || Intrinsics.areEqual(widget.getAlignItems(), "center")) {
                                    Float width3 = widget.getWidth();
                                    fFloatValue = (((width3 != null ? width3.floatValue() : 0.0f) / 2.0f) + drawX) - (decodeBoundItem8.getSumWidth() / 2.0f);
                                } else {
                                    fFloatValue = drawX;
                                }
                                drawAny$default(this, obj5, canvas, fFloatValue, sumHeight, false, 16, null);
                            }
                        }
                        sumHeight += decodeBoundItem8.getSumHeight() + fFloatValue7;
                    }
                }
                list7 = list;
            }
        }
    }

    private final DecodeBoundItem drawImage(Canvas canvas, Image image, float x, float y, boolean onlyDecodeBound, Float scale, RecolorCustom recolorCustom, Float rotateDegrees, Xfermode porterMode) {
        Integer numSafeColorParse;
        List<String> listEmptyList;
        Integer numSafeColorParse2;
        Integer numSafeColorParse3;
        if (image.getSrc() == null || StringsKt__StringsKt.isBlank(image.getSrc())) {
            if (image.getColor() == null || (numSafeColorParse = DialEditHelper.INSTANCE.safeColorParse(image.getColor())) == null) {
                return null;
            }
            int iIntValue = numSafeColorParse.intValue();
            Paint paint = new Paint();
            paint.setColor(iIntValue);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            if (!onlyDecodeBound) {
                canvas.drawRect(0.0f, 0.0f, this.mWidth, this.mHeight, paint);
            }
            int i = this.mWidth;
            int i2 = this.mHeight;
            return new DecodeBoundItem(i, i2, i, i2);
        }
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        String str = this.mFilePath;
        Intrinsics.checkNotNull(str);
        File file = new File(dialFileUtils.getDialResourceFilePath(str), image.getSrc());
        if (!file.exists()) {
            return null;
        }
        DecodeBoundItem decodeBoundItemDecodeImageWidthHeight = decodeImageWidthHeight(file);
        if (scale != null && decodeBoundItemDecodeImageWidthHeight != null) {
            decodeBoundItemDecodeImageWidthHeight = new DecodeBoundItem(decodeBoundItemDecodeImageWidthHeight.getSumWidth() * ((int) scale.floatValue()), decodeBoundItemDecodeImageWidthHeight.getSumHeight() * ((int) scale.floatValue()), decodeBoundItemDecodeImageWidthHeight.getMaxWidth() * ((int) scale.floatValue()), decodeBoundItemDecodeImageWidthHeight.getMaxHeight() * ((int) scale.floatValue()));
        }
        if (onlyDecodeBound) {
            return decodeBoundItemDecodeImageWidthHeight;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
        Theme theme = this.mTheme;
        Intrinsics.checkNotNull(theme);
        DialEditEntity dialEditEntity = theme.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity);
        int recolorIndex = dialEditEntity.getRecolorIndex();
        Paint paint2 = this.bitmapPaint;
        if (recolorCustom != null && recolorCustom.getRecolorEnable() && (numSafeColorParse3 = DialEditHelper.INSTANCE.safeColorParse(recolorCustom.getColor())) != null) {
            paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColorFilter(new PorterDuffColorFilter(numSafeColorParse3.intValue(), PorterDuff.Mode.SRC_IN));
        }
        DialWatchFace dialWatchFace = this.mWatchFace;
        if (dialWatchFace == null || (listEmptyList = dialWatchFace.getRecolorTable()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (image.getRecolorEnable()) {
            List<String> list = listEmptyList;
            if ((!list.isEmpty()) && recolorIndex >= 0 && recolorIndex < list.size() && (numSafeColorParse2 = DialEditHelper.INSTANCE.safeColorParse(listEmptyList.get(recolorIndex))) != null) {
                paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setColorFilter(new PorterDuffColorFilter(numSafeColorParse2.intValue(), PorterDuff.Mode.SRC_IN));
            }
        }
        Paint paint3 = paint2;
        if (scale != null) {
            Matrix matrix = new Matrix();
            matrix.postScale(scale.floatValue(), scale.floatValue());
            bitmapDecodeFile = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            matrix.reset();
        }
        if (porterMode != null) {
            paint3.setXfermode(porterMode);
        }
        if (rotateDegrees != null) {
            Matrix matrix2 = new Matrix();
            matrix2.postRotate(rotateDegrees.floatValue());
            matrix2.postTranslate(x, y);
            canvas.drawBitmap(bitmapDecodeFile, matrix2, paint3);
            matrix2.reset();
        } else {
            canvas.drawBitmap(bitmapDecodeFile, x, y, paint3);
        }
        paint3.setXfermode(null);
        return null;
    }

    public static /* synthetic */ DecodeBoundItem drawImage$default(WatchFaceView watchFaceView, Canvas canvas, Image image, float f, float f2, boolean z, Float f3, RecolorCustom recolorCustom, Float f4, Xfermode xfermode, int i, Object obj) {
        return watchFaceView.drawImage(canvas, image, f, f2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : f3, (i & 64) != 0 ? null : recolorCustom, (i & 128) != 0 ? null : f4, (i & 256) != 0 ? null : xfermode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final DecodeBoundItem drawImageNumberByArray(Canvas canvas, float x, float y, List<Image> fileArray, DataItemImageNumber imageNumber, boolean onlyDecodeBound, boolean imageArrayRecolorEnable) {
        float f;
        float f2;
        float rotation;
        Matrix matrix;
        File file;
        DialWatchFace dialWatchFace;
        List<String> listEmptyList;
        List<String> list;
        Integer numSafeColorParse;
        int space = imageNumber.getSpace();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Image> list2 = fileArray;
        int iMax = -1;
        int iMax2 = -1;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Image image = (Image) obj;
            DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
            String str = this.mFilePath;
            Intrinsics.checkNotNull(str);
            String dialResourceFilePath = dialFileUtils.getDialResourceFilePath(str);
            String src = image.getSrc();
            Intrinsics.checkNotNull(src);
            File file2 = new File(dialResourceFilePath, src);
            if (!file2.exists()) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
            int i5 = options.outWidth;
            int i6 = options.outHeight;
            linkedHashMap.put(image.getSrc(), Integer.valueOf(i5));
            i2 += (i != 0 ? space : 0) + i5;
            i3 += i6;
            iMax = Math.max(iMax, i5);
            iMax2 = Math.max(iMax2, i6);
            i = i4;
        }
        if (onlyDecodeBound) {
            return new DecodeBoundItem(i2, i3, iMax, iMax2);
        }
        String align = imageNumber.getAlign();
        if (!Intrinsics.areEqual(align, TSMAuthContants.PARAM_KEY_RIGHT)) {
            if (Intrinsics.areEqual(align, "center")) {
                f2 = i2 / 2.0f;
            } else {
                f = x;
            }
            rotation = imageNumber.getRotation();
            matrix = new Matrix();
            for (Image image2 : list2) {
                DialFileUtils dialFileUtils2 = DialFileUtils.INSTANCE;
                String str2 = this.mFilePath;
                Intrinsics.checkNotNull(str2);
                String dialResourceFilePath2 = dialFileUtils2.getDialResourceFilePath(str2);
                String src2 = image2.getSrc();
                Intrinsics.checkNotNull(src2);
                file = new File(dialResourceFilePath2, src2);
                if (!file.exists()) {
                    return null;
                }
                Object obj2 = linkedHashMap.get(image2.getSrc());
                Intrinsics.checkNotNull(obj2);
                int iIntValue = ((Number) obj2).intValue();
                float f3 = x - f;
                matrix.postTranslate(-f3, 0.0f);
                matrix.postRotate(rotation);
                matrix.postTranslate(f3 + f, y);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                dialWatchFace = this.mWatchFace;
                if (dialWatchFace != null || (listEmptyList = dialWatchFace.getRecolorTable()) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                Theme theme = this.mTheme;
                Intrinsics.checkNotNull(theme);
                DialEditEntity dialEditEntity = theme.getDialEditEntity();
                Intrinsics.checkNotNull(dialEditEntity);
                int recolorIndex = dialEditEntity.getRecolorIndex();
                if (image2.getRecolorEnable() || imageArrayRecolorEnable) {
                    list = listEmptyList;
                    if (!(!list.isEmpty()) && recolorIndex >= 0 && recolorIndex < list.size() && (numSafeColorParse = DialEditHelper.INSTANCE.safeColorParse(listEmptyList.get(recolorIndex))) != null) {
                        this.bitmapPaint.setColorFilter(new PorterDuffColorFilter(numSafeColorParse.intValue(), PorterDuff.Mode.SRC_IN));
                    }
                }
                canvas.drawBitmap(bitmapDecodeFile, matrix, this.bitmapPaint);
                this.bitmapPaint.setColorFilter(null);
                f += iIntValue + space;
                matrix.reset();
            }
            return null;
        }
        f2 = i2;
        f = x - f2;
        rotation = imageNumber.getRotation();
        matrix = new Matrix();
        while (r3.hasNext()) {
            DialFileUtils dialFileUtils3 = DialFileUtils.INSTANCE;
            String str3 = this.mFilePath;
            Intrinsics.checkNotNull(str3);
            String dialResourceFilePath3 = dialFileUtils3.getDialResourceFilePath(str3);
            String src3 = image2.getSrc();
            Intrinsics.checkNotNull(src3);
            file = new File(dialResourceFilePath3, src3);
            if (!file.exists()) {
                return null;
            }
            Object obj3 = linkedHashMap.get(image2.getSrc());
            Intrinsics.checkNotNull(obj3);
            int iIntValue2 = ((Number) obj3).intValue();
            float f4 = x - f;
            matrix.postTranslate(-f4, 0.0f);
            matrix.postRotate(rotation);
            matrix.postTranslate(f4 + f, y);
            Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file.getAbsolutePath());
            dialWatchFace = this.mWatchFace;
            if (dialWatchFace != null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            Theme theme2 = this.mTheme;
            Intrinsics.checkNotNull(theme2);
            DialEditEntity dialEditEntity2 = theme2.getDialEditEntity();
            Intrinsics.checkNotNull(dialEditEntity2);
            int recolorIndex2 = dialEditEntity2.getRecolorIndex();
            if (image2.getRecolorEnable()) {
                list = listEmptyList;
                if (!(!list.isEmpty())) {
                }
            } else {
                list = listEmptyList;
                if (!(!list.isEmpty())) {
                }
            }
            canvas.drawBitmap(bitmapDecodeFile2, matrix, this.bitmapPaint);
            this.bitmapPaint.setColorFilter(null);
            f += iIntValue2 + space;
            matrix.reset();
        }
        return null;
    }

    private final DecodeBoundItem drawImageWrapper(Canvas canvas, ImageWrapper any, float drawX, float drawY, boolean onlyDecodeBound) {
        Image imageExpectGetImage = expectGetImage(any);
        if (imageExpectGetImage == null) {
            return null;
        }
        return drawImage$default(this, canvas, imageExpectGetImage, drawX, drawY, onlyDecodeBound, null, null, null, null, 480, null);
    }

    public static /* synthetic */ DecodeBoundItem drawImageWrapper$default(WatchFaceView watchFaceView, Canvas canvas, ImageWrapper imageWrapper, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return watchFaceView.drawImageWrapper(canvas, imageWrapper, f, f2, z);
    }

    private final void drawLayout(Canvas canvas, Layout layout) {
        Map<String, ? extends Object> map;
        Object obj;
        String ref = layout.getRef();
        if (ref == null || (map = this.mResourceMap) == null || (obj = map.get(ref)) == null) {
            return;
        }
        float x = layout.getX();
        float y = layout.getY();
        Logger.d(TAG, "drawLayout " + obj);
        drawAny$default(this, obj, canvas, x, y, false, 16, null);
    }

    private final void drawPhotoImage(Canvas canvas, String filePath) {
        Bitmap bitmapDecodeFile;
        if (filePath == null || filePath.length() == 0 || (bitmapDecodeFile = BitmapFactory.decodeFile(filePath)) == null) {
            return;
        }
        canvas.drawBitmap(bitmapDecodeFile, new Matrix(), this.bitmapPaint);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    private final void drawSlot(Canvas canvas, Slot slot, float drawX, float drawY) {
        Integer numValueOf;
        DialEditEntity dialEditEntity;
        DialEditEntity dialEditEntity2;
        SlotEditItem dialSlotEditItem;
        int selectWidgetIndex;
        Theme theme;
        DialEditEntity dialEditEntity3;
        List<SlotEditItem> slotItemList;
        String ref;
        Map<String, ? extends Object> map;
        Object obj;
        float f;
        float y;
        DialEditEntity dialEditEntity4;
        DialEditEntity dialEditEntity5;
        SlotEditItem fontSlotEditItem;
        DialEditEntity dialEditEntity6;
        SlotEditItem timeSlotEditItem;
        List<SlotWidgetItem> itemList = slot.getItemList();
        List<SlotPosition> positionList = slot.getPositionList();
        Object obj2 = null;
        if (this.isPortrait) {
            numValueOf = this.positionIndex;
        } else {
            Theme theme2 = this.mTheme;
            numValueOf = (theme2 == null || (dialEditEntity = theme2.getDialEditEntity()) == null) ? null : Integer.valueOf(dialEditEntity.getPositionIndex());
        }
        String type = slot.getType();
        List<SlotWidgetItem> list = itemList;
        if (list == null || list.isEmpty()) {
            return;
        }
        int iHashCode = type.hashCode();
        if (iHashCode != 3083120) {
            if (iHashCode != 3148879) {
                if (iHashCode == 3560141 && type.equals("time")) {
                    Theme theme3 = this.mTheme;
                    if (theme3 == null || (dialEditEntity6 = theme3.getDialEditEntity()) == null || (timeSlotEditItem = dialEditEntity6.getTimeSlotEditItem()) == null) {
                        selectWidgetIndex = 0;
                    } else {
                        selectWidgetIndex = timeSlotEditItem.getSelectWidgetIndex();
                    }
                } else {
                    theme = this.mTheme;
                    if (theme != null || (dialEditEntity3 = theme.getDialEditEntity()) == null || (slotItemList = dialEditEntity3.getSlotItemList()) == null) {
                        selectWidgetIndex = 0;
                    } else {
                        for (Object obj3 : slotItemList) {
                            if (Intrinsics.areEqual(slot.getName(), ((SlotEditItem) obj3).getKeyName())) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        SlotEditItem slotEditItem = (SlotEditItem) obj2;
                        if (slotEditItem != null) {
                            selectWidgetIndex = slotEditItem.getSelectWidgetIndex();
                        } else {
                            selectWidgetIndex = 0;
                        }
                    }
                }
            } else if (type.equals(SlotType.FONT)) {
                Theme theme4 = this.mTheme;
                if (theme4 == null || (dialEditEntity5 = theme4.getDialEditEntity()) == null || (fontSlotEditItem = dialEditEntity5.getFontSlotEditItem()) == null) {
                    selectWidgetIndex = 0;
                } else {
                    selectWidgetIndex = fontSlotEditItem.getSelectWidgetIndex();
                }
            } else {
                theme = this.mTheme;
                if (theme != null) {
                    selectWidgetIndex = 0;
                } else {
                    selectWidgetIndex = 0;
                }
            }
        } else if (type.equals(SlotType.DIAL)) {
            Theme theme5 = this.mTheme;
            if (theme5 == null || (dialEditEntity2 = theme5.getDialEditEntity()) == null || (dialSlotEditItem = dialEditEntity2.getDialSlotEditItem()) == null) {
                selectWidgetIndex = 0;
            } else {
                selectWidgetIndex = dialSlotEditItem.getSelectWidgetIndex();
            }
        } else {
            theme = this.mTheme;
            if (theme != null) {
                selectWidgetIndex = 0;
            } else {
                selectWidgetIndex = 0;
            }
        }
        if (selectWidgetIndex < 0 || selectWidgetIndex >= list.size() || (ref = itemList.get(selectWidgetIndex).getRef()) == null || (map = this.mResourceMap) == null || (obj = map.get(ref)) == null || !(obj instanceof CustomWidget)) {
            return;
        }
        List<SlotPosition> list2 = positionList;
        if (list2 == null || list2.isEmpty() || numValueOf == null || numValueOf.intValue() < 0) {
            f = drawX;
            y = drawY;
        } else {
            SlotPosition slotPosition = positionList.get(CollectionsKt__CollectionsKt.getIndices(list2).contains(numValueOf.intValue()) ? numValueOf.intValue() : 0);
            float x = slotPosition.getX();
            y = slotPosition.getY();
            f = x;
        }
        Theme theme6 = this.mTheme;
        if (theme6 != null && (dialEditEntity4 = theme6.getDialEditEntity()) != null) {
            dialEditEntity4.getSlotItemEditProcessIndex();
        }
        drawCustomWidget(canvas, (CustomWidget) obj, f, y, type, false, Intrinsics.areEqual(type, "widget"));
    }

    private final void drawSprite(Canvas canvas, Sprite sprite, float drawX, float drawY) {
        List<Image> imageList;
        Image image;
        ImageArray imageArrayExpectGetImageArrayByRefKey = expectGetImageArrayByRefKey(sprite.getRef());
        if (imageArrayExpectGetImageArrayByRefKey == null || (imageList = imageArrayExpectGetImageArrayByRefKey.getImageList()) == null || (image = (Image) CollectionsKt___CollectionsKt.lastOrNull((List) imageList)) == null) {
            return;
        }
        drawImage$default(this, canvas, image, drawX, drawY, false, null, null, null, null, 496, null);
    }

    private final Image expectGetImage(Object refObj) {
        if (refObj instanceof Image) {
            return (Image) refObj;
        }
        Object obj = null;
        if (!(refObj instanceof ImageWrapper)) {
            return null;
        }
        List<Image> list = ((ImageWrapper) refObj).getList();
        Theme theme = this.mTheme;
        Intrinsics.checkNotNull(theme);
        List<String> colorGroupTable = theme.getColorGroupTable();
        List<Image> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        Theme theme2 = this.mTheme;
        Intrinsics.checkNotNull(theme2);
        DialEditEntity dialEditEntity = theme2.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity);
        int colorGroupIndex = dialEditEntity.getColorGroupIndex();
        List<String> list3 = colorGroupTable;
        if (list3 == null || list3.isEmpty() || colorGroupIndex < 0 || colorGroupIndex < 0 || colorGroupIndex >= list3.size()) {
            return (Image) CollectionsKt___CollectionsKt.first((List) list);
        }
        String str = colorGroupTable.get(colorGroupIndex);
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((Image) obj2).getColorGroup(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Image) obj;
    }

    private final ImageArray expectGetImageArray(Object refObj) {
        if (refObj instanceof ImageArray) {
            return (ImageArray) refObj;
        }
        Object obj = null;
        if (!(refObj instanceof ImageArrayWrapper)) {
            return null;
        }
        List<ImageArray> list = ((ImageArrayWrapper) refObj).getList();
        Theme theme = this.mTheme;
        Intrinsics.checkNotNull(theme);
        List<String> colorGroupTable = theme.getColorGroupTable();
        List<ImageArray> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        Theme theme2 = this.mTheme;
        Intrinsics.checkNotNull(theme2);
        DialEditEntity dialEditEntity = theme2.getDialEditEntity();
        Intrinsics.checkNotNull(dialEditEntity);
        int colorGroupIndex = dialEditEntity.getColorGroupIndex();
        List<String> list3 = colorGroupTable;
        if (list3 == null || list3.isEmpty() || colorGroupIndex < 0 || colorGroupIndex < 0 || colorGroupIndex >= list3.size()) {
            return (ImageArray) CollectionsKt___CollectionsKt.first((List) list);
        }
        String str = colorGroupTable.get(colorGroupIndex);
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((ImageArray) obj2).getColorGroup(), str)) {
                obj = obj2;
                break;
            }
        }
        return (ImageArray) obj;
    }

    private final ImageArray expectGetImageArrayByRefKey(String refKey) {
        if (refKey == null) {
            return null;
        }
        Map<String, ? extends Object> map = this.mResourceMap;
        Intrinsics.checkNotNull(map);
        Object obj = map.get(refKey);
        if (obj == null) {
            return null;
        }
        return expectGetImageArray(obj);
    }

    private final Image expectGetImageByRefKey(String refKey) {
        if (refKey == null) {
            return null;
        }
        Map<String, ? extends Object> map = this.mResourceMap;
        Intrinsics.checkNotNull(map);
        Object obj = map.get(refKey);
        if (obj == null) {
            return null;
        }
        return expectGetImage(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Number] */
    private final Pair<List<String>, List<Integer>> getTextAndColorStrList(String textStr, List<TextContent> sourceList) {
        List<TextContent> list = sourceList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String source = ((TextContent) it.next()).getSource();
            ?? textDefaultString = DialSourceUtilsKt.getTextDefaultString(source);
            if (StringsKt__StringsKt.isBlank(textDefaultString)) {
                textDefaultString = DialSourceUtilsKt.getSourceDefaultValue(source);
            }
            arrayList.add(textDefaultString);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        String string = Arrays.toString(array);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.d(TAG, "getTextAndColorStrList arrayOfAny:" + string);
        if (!StringsKt__StringsJVMKt.startsWith$default(textStr, PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 2, null)) {
            String strStringFormatBySource = stringFormatBySource(textStr, array);
            return (strStringFormatBySource == null || StringsKt__StringsKt.isBlank(strStringFormatBySource)) ? new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList()) : new Pair<>(CollectionsKt__CollectionsJVMKt.listOf(strStringFormatBySource), CollectionsKt__CollectionsKt.emptyList());
        }
        Matcher matcher = Pattern.compile("#(.*?)#").matcher(textStr);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group(matcher.groupCount());
            if (strGroup != null && !StringsKt__StringsKt.isBlank(strGroup)) {
                String[] strArrSplit = Pattern.compile(" ").split(strGroup, 2);
                if (strArrSplit.length == 2) {
                    DialEditHelper dialEditHelper = DialEditHelper.INSTANCE;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("#%s", Arrays.copyOf(new Object[]{strArrSplit[0]}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    Integer numSafeColorParse = dialEditHelper.safeColorParse(str);
                    if (numSafeColorParse != null) {
                        ListExtKt.add(arrayList3, Integer.valueOf(numSafeColorParse.intValue()));
                    }
                    String str2 = strArrSplit[1];
                    Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                    String strStringFormatBySource2 = stringFormatBySource(str2, array);
                    if (strStringFormatBySource2 != null) {
                        ListExtKt.add(arrayList2, strStringFormatBySource2);
                    }
                } else if (strArrSplit.length == 1) {
                    String str3 = strArrSplit[0];
                    Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                    String strStringFormatBySource3 = stringFormatBySource(str3, array);
                    if (strStringFormatBySource3 != null) {
                        ListExtKt.add(arrayList2, strStringFormatBySource3);
                    }
                }
            }
        }
        return new Pair<>(arrayList2, arrayList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (r11.equals("semibold") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
    
        if (r11.equals("demibold") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a3, code lost:
    
        if (r11.equals("extralight") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        if (r11.equals("light") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        if (r11.equals(androidx.health.connect.client.records.CervicalMucusRecord.Sensation.HEAVY) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return android.graphics.Typeface.create("mipro-light", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return android.graphics.Typeface.create("mipro_medium", 1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Typeface getTextTypeFace(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.watch.face.edit.ui.WatchFaceView.getTextTypeFace(java.lang.String, java.lang.String):android.graphics.Typeface");
    }

    private final List<DecodeBoundItem> getWidgetListWidthHeight(Canvas canvas, List<WidgetItem> widgetItemList) {
        ArrayList arrayList = new ArrayList();
        Iterator<WidgetItem> it = widgetItemList.iterator();
        while (it.hasNext()) {
            String ref = it.next().getRef();
            Object objDrawAny = null;
            if (ref != null) {
                Map<String, ? extends Object> map = this.mResourceMap;
                if ((map != null ? map.get(ref) : null) != null) {
                    Map<String, ? extends Object> map2 = this.mResourceMap;
                    Object obj = map2 != null ? map2.get(ref) : null;
                    Intrinsics.checkNotNull(obj);
                    objDrawAny = drawAny(obj, canvas, 0.0f, 0.0f, true);
                }
            }
            Logger.d(TAG, "getWidgetListWidthHeight " + ref + " " + objDrawAny);
            ListExtKt.add(arrayList, objDrawAny);
        }
        return arrayList;
    }

    private final void initPaint() {
        this.bitmapPaint.setAntiAlias(true);
    }

    private final boolean isPunctuation(char ch) {
        return Character.getType(ch) == 24;
    }

    private final String stringFormatBySource(String formatString, Object[] args) {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(formatString, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception e) {
            Logger.e(TAG, "stringFormatBySource exception " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x005d  */
    public final void fillView(@NotNull DialWatchFace watchFace, @NotNull Theme theme, @NotNull String filePath, @Nullable FaceEditPhotoBean faceEditPhotoBean, boolean onlyForeground, boolean isPortrait, float editScale, @Nullable String defaultVideoThumbPath) {
        int i;
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Logger.i(TAG, "fillView " + watchFace.getShortString() + ",filePath:" + filePath);
        this.mWidth = (int) watchFace.getWidth();
        this.mHeight = (int) watchFace.getHeight();
        this.mWatchFace = watchFace;
        this.mResourceMap = watchFace.getResourceMap();
        this.mTheme = theme;
        this.mFilePath = filePath;
        this.mDefaultVideoThumbPath = defaultVideoThumbPath;
        this.faceEditPhotoBean = faceEditPhotoBean;
        this.isPortrait = isPortrait;
        if (isPortrait) {
            if (faceEditPhotoBean != null) {
                i = faceEditPhotoBean.getPositionIndex() != 1 ? 0 : 1;
            }
            this.positionIndex = Integer.valueOf(i);
        }
        this.onlyForeground = onlyForeground;
        this.editScale = editScale;
        setMeasuredDimension(this.mWidth, this.mHeight);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Theme theme;
        WatchFaceImage foregroundImage;
        WatchFaceImage foregroundImage2;
        WatchFaceImage backgroundImage;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.mFilePath == null || (theme = this.mTheme) == null || theme.getLayoutList() == null || this.mWatchFace == null) {
            return;
        }
        initPaint();
        String cropPath = null;
        if (this.faceEditPhotoBean == null && !this.onlyForeground) {
            Theme theme2 = this.mTheme;
            if (theme2 != null && !theme2.isVideoWatchFace()) {
                drawBgIfNeed(canvas);
            }
            Theme theme3 = this.mTheme;
            Intrinsics.checkNotNull(theme3);
            List<Layout> layoutList = theme3.getLayoutList();
            Intrinsics.checkNotNull(layoutList);
            for (Layout layout : layoutList) {
                Theme theme4 = this.mTheme;
                if (!Intrinsics.areEqual(theme4 != null ? theme4.getBg() : null, layout.getRef())) {
                    drawLayout(canvas, layout);
                }
            }
            drawFgIfNeed(canvas);
            return;
        }
        Theme theme5 = this.mTheme;
        Intrinsics.checkNotNull(theme5);
        List<Layout> layoutList2 = theme5.getLayoutList();
        Intrinsics.checkNotNull(layoutList2);
        int size = layoutList2.size();
        for (int i = 0; i < size; i++) {
            Theme theme6 = this.mTheme;
            if (Intrinsics.areEqual(theme6 != null ? theme6.getType() : null, "AOD") || i != 0) {
                Theme theme7 = this.mTheme;
                Intrinsics.checkNotNull(theme7);
                List<Layout> layoutList3 = theme7.getLayoutList();
                Intrinsics.checkNotNull(layoutList3);
                drawLayout(canvas, layoutList3.get(i));
            } else if (!this.onlyForeground) {
                FaceEditPhotoBean faceEditPhotoBean = this.faceEditPhotoBean;
                drawPhotoImage(canvas, (faceEditPhotoBean == null || (backgroundImage = faceEditPhotoBean.getBackgroundImage()) == null) ? null : backgroundImage.getCropPath());
            }
        }
        Theme theme8 = this.mTheme;
        if (Intrinsics.areEqual(theme8 != null ? theme8.getType() : null, "AOD")) {
            return;
        }
        FaceEditPhotoBean faceEditPhotoBean2 = this.faceEditPhotoBean;
        String cropPath2 = (faceEditPhotoBean2 == null || (foregroundImage2 = faceEditPhotoBean2.getForegroundImage()) == null) ? null : foregroundImage2.getCropPath();
        if (cropPath2 == null || cropPath2.length() == 0) {
            if (this.faceEditPhotoBean == null && !this.onlyForeground) {
                drawFgIfNeed(canvas);
                return;
            }
            return;
        }
        FaceEditPhotoBean faceEditPhotoBean3 = this.faceEditPhotoBean;
        if (faceEditPhotoBean3 != null && (foregroundImage = faceEditPhotoBean3.getForegroundImage()) != null) {
            cropPath = foregroundImage.getCropPath();
        }
        drawPhotoImage(canvas, cropPath);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.mWatchFace == null) {
            return;
        }
        setMeasuredDimension(this.mWidth, this.mHeight);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WatchFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WatchFaceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WatchFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.editScale = 1.83f;
        this.bitmapPaint = new Paint(1);
        this.textPaint = new TextPaint(1);
    }
}
