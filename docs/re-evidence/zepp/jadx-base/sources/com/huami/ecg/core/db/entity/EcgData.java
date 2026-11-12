package com.huami.ecg.core.db.entity;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.convert.Converters;
import com.huami.ecg.core.model.AdditionalInfo;
import com.huami.ecg.core.model.BioIdFeedback;
import com.huami.ecg.core.model.BioIdRecord;
import com.huami.ecg.core.model.Diagnosis;
import com.huami.ecg.core.model.EcgDiseaseRecord;
import com.huami.ecg.core.model.EcgExData;
import com.huami.ecg.core.model.EcgHealthRecord;
import com.huami.ecg.core.model.EcgReport;
import com.huami.ecg.core.model.EcgResultData;
import com.huami.ecg.core.model.MeasureState;
import com.huami.ecg.core.model.constant.BioIdMatchedType;
import com.huami.ecg.core.model.constant.DiseaseType;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.core.model.constant.MeasurePosture;
import com.huami.ecg.core.util.EcgFileUtil;
import com.huami.hmchartui.utils.Constant;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.phn.core.webapi.impl.PHNInitWebApiImpl;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointType;
import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({Converters.class})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u008a\u00022\u00020\u0001:\b\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002B\u000b\b\u0016¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002B\u001d\b\u0016\u0012\u0007\u0010\u0086\u0002\u001a\u00020#\u0012\u0007\u0010\u0087\u0002\u001a\u00020\u0012¢\u0006\u0006\b\u0084\u0002\u0010\u0088\u0002B\u0013\b\u0016\u0012\u0007\u0010\u0087\u0002\u001a\u00020\u0012¢\u0006\u0005\b\u0084\u0002\u0010\u001aB\u001c\b\u0016\u0012\u0007\u0010\u0087\u0002\u001a\u00020\u0012\u0012\u0006\u00102\u001a\u00020\u0012¢\u0006\u0006\b\u0084\u0002\u0010\u0089\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012R\"\u0010\u001b\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u00102\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\"\u00105\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b\u000b\u0010!R.\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010%\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010)R\"\u0010V\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010%\u001a\u0004\bT\u0010'\"\u0004\bU\u0010)R\"\u0010Z\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010%\u001a\u0004\bX\u0010'\"\u0004\bY\u0010)R\"\u0010^\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\u001d\u001a\u0004\b\\\u0010\u001f\"\u0004\b]\u0010!R\"\u0010b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010\u001d\u001a\u0004\b`\u0010\u001f\"\u0004\ba\u0010!R\"\u0010f\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010%\u001a\u0004\bd\u0010'\"\u0004\be\u0010)R\"\u0010j\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0016\u001a\u0004\bh\u0010\u0018\"\u0004\bi\u0010\u001aR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR*\u0010w\u001a\u00020\f2\u0006\u0010s\u001a\u00020\f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010\u001d\u001a\u0004\bu\u0010\u001f\"\u0004\bv\u0010!R\"\u0010{\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010\u0016\u001a\u0004\by\u0010\u0018\"\u0004\bz\u0010\u001aR\"\u0010\u007f\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010%\u001a\u0004\b}\u0010'\"\u0004\b~\u0010)R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u001d\u001a\u0005\b\u0081\u0001\u0010\u001f\"\u0005\b\u0082\u0001\u0010!R&\u0010\u0087\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\u001d\u001a\u0005\b\u0085\u0001\u0010\u001f\"\u0005\b\u0086\u0001\u0010!R&\u0010\u008b\u0001\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010%\u001a\u0005\b\u0089\u0001\u0010'\"\u0005\b\u008a\u0001\u0010)R&\u0010\u008f\u0001\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010%\u001a\u0005\b\u008d\u0001\u0010'\"\u0005\b\u008e\u0001\u0010)R&\u0010\u0093\u0001\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010%\u001a\u0005\b\u0091\u0001\u0010'\"\u0005\b\u0092\u0001\u0010)R&\u0010\u0097\u0001\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010%\u001a\u0005\b\u0095\u0001\u0010'\"\u0005\b\u0096\u0001\u0010)R&\u0010\u009b\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010\u001d\u001a\u0005\b\u0099\u0001\u0010\u001f\"\u0005\b\u009a\u0001\u0010!R&\u0010\u009f\u0001\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010%\u001a\u0005\b\u009d\u0001\u0010'\"\u0005\b\u009e\u0001\u0010)R&\u0010£\u0001\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010\u0016\u001a\u0005\b¡\u0001\u0010\u0018\"\u0005\b¢\u0001\u0010\u001aR&\u0010§\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010\u001d\u001a\u0005\b¥\u0001\u0010\u001f\"\u0005\b¦\u0001\u0010!R&\u0010«\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010\u001d\u001a\u0005\b©\u0001\u0010\u001f\"\u0005\bª\u0001\u0010!R&\u0010¯\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010\u001d\u001a\u0005\b\u00ad\u0001\u0010\u001f\"\u0005\b®\u0001\u0010!R&\u0010³\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010\u001d\u001a\u0005\b±\u0001\u0010\u001f\"\u0005\b²\u0001\u0010!R&\u0010·\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b´\u0001\u0010\u001d\u001a\u0005\bµ\u0001\u0010\u001f\"\u0005\b¶\u0001\u0010!R+\u0010¾\u0001\u001a\u0005\u0018\u00010¸\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b%\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R'\u0010Á\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u0016\u0010\u001d\u001a\u0005\b¿\u0001\u0010\u001f\"\u0005\bÀ\u0001\u0010!R*\u0010É\u0001\u001a\u00030Â\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R(\u0010Í\u0001\u001a\u00020\f2\u0007\u0010Ê\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bË\u0001\u0010\u001f\"\u0005\bÌ\u0001\u0010!R0\u0010Ô\u0001\u001a\u0005\u0018\u00010Î\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Î\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R+\u0010Ú\u0001\u001a\u00030Õ\u00012\u0007\u00107\u001a\u00030Õ\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R+\u0010à\u0001\u001a\u00030Û\u00012\u0007\u00107\u001a\u00030Û\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R0\u0010æ\u0001\u001a\u0005\u0018\u00010á\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010á\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R\u0017\u0010ê\u0001\u001a\u00030ç\u00018F@\u0006¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0016\u0010ë\u0001\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u0016\u0010í\u0001\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\bí\u0001\u0010ì\u0001R)\u0010î\u0001\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bî\u0001\u0010ì\u0001\"\u0006\bï\u0001\u0010ð\u0001R)\u0010ñ\u0001\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bñ\u0001\u0010ì\u0001\"\u0006\bò\u0001\u0010ð\u0001R)\u0010ó\u0001\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bó\u0001\u0010ì\u0001\"\u0006\bô\u0001\u0010ð\u0001R\u0016\u0010õ\u0001\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\bõ\u0001\u0010ì\u0001R\u0015\u0010÷\u0001\u001a\u00020#8F@\u0006¢\u0006\u0007\u001a\u0005\bö\u0001\u0010'R0\u0010þ\u0001\u001a\u0005\u0018\u00010ø\u00012\n\u0010ù\u0001\u001a\u0005\u0018\u00010ø\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R\u0016\u0010ÿ\u0001\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\bÿ\u0001\u0010ì\u0001R\u0016\u0010\u0080\u0002\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010ì\u0001R\u0016\u0010\u0081\u0002\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010ì\u0001R\u0016\u0010\u0082\u0002\u001a\u00020\u00028F@\u0006¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010ì\u0001R(\u0010\u0083\u0002\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0083\u0002\u0010ì\u0001\"\u0005\bU\u0010ð\u0001¨\u0006\u008e\u0002"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgData;", "Ljava/io/Serializable;", "", "a", "checkPPGData", "existECGRawFile", "existPPGRawFile", "", "setAfib", "matched", "badECG", "setBioIdMatchedType", "", "toString", "updateWithServer", "withPPG", "isDiagnosisAccelerated", "setDiagnosisAccelerated", "", "speededTime", "setSpeededTime", "getAcceleratedTime", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "timestamp", "b", "Ljava/lang/String;", "getTimeZone", "()Ljava/lang/String;", "setTimeZone", "(Ljava/lang/String;)V", "timeZone", "", "c", LogUtil.I, "getDeviceSource", "()I", "setDeviceSource", "(I)V", "deviceSource", GoogleApiAvailabilityLight.a, "getMeasureContentType", "setMeasureContentType", "measureContentType", "e", "getGroupId", "setGroupId", EcgData.GROUP_ID, "f", "getBioIdMatchedType", "bioIdMatchedType", "Lcom/huami/ecg/core/model/BioIdFeedback;", "value", "g", "Lcom/huami/ecg/core/model/BioIdFeedback;", "getBioIdFeedback", "()Lcom/huami/ecg/core/model/BioIdFeedback;", "setBioIdFeedback", "(Lcom/huami/ecg/core/model/BioIdFeedback;)V", EcgData.BIOID_FEEDBACK, "Lcom/huami/ecg/core/model/Diagnosis;", "h", "Lcom/huami/ecg/core/model/Diagnosis;", "getDiagnosis", "()Lcom/huami/ecg/core/model/Diagnosis;", "setDiagnosis", "(Lcom/huami/ecg/core/model/Diagnosis;)V", EcgData.DIAGNOSIS, "Lcom/huami/ecg/core/model/MeasureState;", "i", "Lcom/huami/ecg/core/model/MeasureState;", "getMeasureState", "()Lcom/huami/ecg/core/model/MeasureState;", "setMeasureState", "(Lcom/huami/ecg/core/model/MeasureState;)V", EcgData.MEASURE_STATE, z.j, "getMeasureMethodType", "setMeasureMethodType", "measureMethodType", hl.k, "getUserAttention", "setUserAttention", "userAttention", "l", "getMIsContainPPG", "setMIsContainPPG", "mIsContainPPG", "m", "getMeasurePosture", "setMeasurePosture", "measurePosture", GoogleApiAvailabilityLight.b, "getWearPosition", "setWearPosition", EcgData.WEAR_POSITION, "o", "getSampleRate", "setSampleRate", BehaviorTaggingWebApi.g.s, b.r, "getMeasureSecond", "setMeasureSecond", "measureSecond", "Lcom/huami/ecg/core/model/EcgResultData;", DTransferConstants.SEARCH_KEY, "Lcom/huami/ecg/core/model/EcgResultData;", "getEcgResultData", "()Lcom/huami/ecg/core/model/EcgResultData;", "setEcgResultData", "(Lcom/huami/ecg/core/model/EcgResultData;)V", "ecgResultData", "serverUri", "r", "getServerRawUri", "setServerRawUri", "serverRawUri", SOAP.XMLNS, "getServerUpdatedTime", "setServerUpdatedTime", "serverUpdatedTime", "t", "getMErrorCode", "setMErrorCode", "mErrorCode", "u", "getDiseaseType", "setDiseaseType", EcgData.DISEASE_TYPE, "v", "getMSourceAppName", "setMSourceAppName", "mSourceAppName", "w", "getMNoneBioIdSelf", "setMNoneBioIdSelf", "mNoneBioIdSelf", "x", "getMExtFatigue", "setMExtFatigue", "mExtFatigue", "y", "getMExtBPsys", "setMExtBPsys", "mExtBPsys", "z", "getMExtBPDias", "setMExtBPDias", "mExtBPDias", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getThumbnailPath", "setThumbnailPath", EcgData.THUMBNAIL_PATH, "B", "getMLocalFilter", "setMLocalFilter", "mLocalFilter", "C", "getLocalUpdatedTime", "setLocalUpdatedTime", EcgData.TIMESTAMP_LOCAL_UPDATED, LogUtil.D, "getLocalECGRawUri", "setLocalECGRawUri", "localECGRawUri", "E", "getLocalPPGRawUri", "setLocalPPGRawUri", "localPPGRawUri", "F", "getUserId", "setUserId", "userId", "G", "getDeviceId", "setDeviceId", "deviceId", "H", "getDeviceSn", "setDeviceSn", ParamKey.deviceSn, "Lcom/huami/ecg/core/model/EcgExData;", "Lcom/huami/ecg/core/model/EcgExData;", "getExtraStatus", "()Lcom/huami/ecg/core/model/EcgExData;", "setExtraStatus", "(Lcom/huami/ecg/core/model/EcgExData;)V", EcgData.EXTRA_STATUS, "getTagValue", "setTagValue", "tagValue", "Lcom/huami/ecg/core/model/EcgReport;", "K", "Lcom/huami/ecg/core/model/EcgReport;", "getReport", "()Lcom/huami/ecg/core/model/EcgReport;", "setReport", "(Lcom/huami/ecg/core/model/EcgReport;)V", PointCategory.REPORT, "version", "getAlgoVersion", "setAlgoVersion", PHNInitWebApiImpl.PARAM_PHN_ALGO_VERSION, "Lcom/huami/ecg/core/model/BioIdRecord;", "record", "getBioIdRecord", "()Lcom/huami/ecg/core/model/BioIdRecord;", "setBioIdRecord", "(Lcom/huami/ecg/core/model/BioIdRecord;)V", "bioIdRecord", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "setCalendar", "(Ljava/util/Calendar;)V", "calendar", "Lcom/huami/ecg/core/model/EcgDiseaseRecord;", "getDiseaseRecord", "()Lcom/huami/ecg/core/model/EcgDiseaseRecord;", "setDiseaseRecord", "(Lcom/huami/ecg/core/model/EcgDiseaseRecord;)V", "diseaseRecord", "Lcom/huami/ecg/core/model/EcgHealthRecord;", "getHealthRecord", "()Lcom/huami/ecg/core/model/EcgHealthRecord;", "setHealthRecord", "(Lcom/huami/ecg/core/model/EcgHealthRecord;)V", "healthRecord", "", "getNoisyResult", "()[J", "noisyResult", "isAfib", "()Z", EcgData.IS_CONTAIN_PPG, "isNoneBioIdSelf", "setNoneBioIdSelf", "(Z)V", "isOnline", "setOnline", "isSelf", "setSelf", "isFeedbackSelf", "getRrPeaks", "rrPeaks", "Lcom/huami/ecg/core/model/AdditionalInfo;", "info", "getAdditionalInfo", "()Lcom/huami/ecg/core/model/AdditionalInfo;", "setAdditionalInfo", "(Lcom/huami/ecg/core/model/AdditionalInfo;)V", "additionalInfo", "isProbe", "isProbeGroup", "isProbeFragment", "isServerRawUriExisted", "isUserAttention", "<init>", "()V", "source", "secondtime", "(IJ)V", "(JJ)V", "Companion", com.huami.wallet.accessdoor.utils.ParamKey.ERROR_CODE, "FilterCode", "NoneBioIdSelf", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
@Entity(tableName = "ecg_data")
public final class EcgData implements Serializable {

    @NotNull
    public static final String APP_NAME = "generateAppName";

    @NotNull
    public static final String BIOID_FEEDBACK = "bioIdFeedback";

    @NotNull
    public static final String BIOID_MATCHED_TYPE = "bioIdMatchType";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_DEVICE_SOURCE = 4;

    @NotNull
    public static final String DEFAULT_DIGIT_VALUE = "-1";

    @NotNull
    public static final String DEFAULT_PATH_VALUE = "0";
    public static final int DEFAULT_VALUE_NEGTIVE = -1;
    public static final int DEFAULT_VALUE_ZERO = 0;

    @NotNull
    public static final String DEVICE_ID = "deviceId";

    @NotNull
    public static final String DIAGNOSIS = "diagnosis";

    @NotNull
    public static final String DISEASE_TYPE = "diseaseType";

    @NotNull
    public static final String ERROR_CODE = "errorCause";

    @NotNull
    public static final String EXTRA_STATUS = "extraStatus";

    @NotNull
    public static final String GROUP_ID = "groupId";

    @NotNull
    public static final String IS_CONTAIN_PPG = "isContainPPG";

    @NotNull
    public static final String LOCAL_ECG_RAW_FILE_PATH = "rawLocalPath";

    @NotNull
    public static final String LOCAL_EXT_BPDIAS = "ext_bpdias";

    @NotNull
    public static final String LOCAL_EXT_BPSYS = "ext_bpsys";

    @NotNull
    public static final String LOCAL_EXT_FATIGUE = "ext_fatigue";

    @NotNull
    public static final String LOCAL_FILTER = "filter";

    @NotNull
    public static final String LOCAL_NONE_BIOID_SELF = "ext_none_bioid_self";

    @NotNull
    public static final String LOCAL_PPG_RAW_FILE_PATH = "rawLocalPathPPG";

    @NotNull
    public static final String MEASURE_CONTENT_TYPE = "type";

    @NotNull
    public static final String MEASURE_METHOD_TYPE = "online";

    @NotNull
    public static final String MEASURE_POSTURE = "posture";

    @NotNull
    public static final String MEASURE_SECOND = "measureSeconds";

    @NotNull
    public static final String MEASURE_STATE = "measureState";

    @NotNull
    public static final String RESULT_DATA = "resultData";

    @NotNull
    public static final String SAMPLE_RATE = "ecgSamplingRate";

    @NotNull
    public static final String SERVER_RAW_FILE_PATH = "rawDataURI";

    @NotNull
    public static final String SN = "sn";

    @NotNull
    public static final String SOURCE = "deviceSource";

    @NotNull
    public static final String THUMBNAIL_PATH = "thumbnailPath";

    @NotNull
    public static final String TIMESTAMP_CREATED = "generatedTime";

    @NotNull
    public static final String TIMESTAMP_LOCAL_UPDATED = "localUpdatedTime";

    @NotNull
    public static final String TIMESTAMP_SERVER_UPDATED = "updateTime";

    @NotNull
    public static final String TIMEZONE = "timeZone";

    @NotNull
    public static final String USER_ATTENTION = "isAttention";

    @NotNull
    public static final String USER_ID = "userId";

    @NotNull
    public static final String WEAR_POSITION = "wearPosition";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName(THUMBNAIL_PATH)
    @ColumnInfo(name = THUMBNAIL_PATH)
    @NotNull
    private String thumbnailPath;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("filter")
    @ColumnInfo(name = "filter")
    private int mLocalFilter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName(TIMESTAMP_LOCAL_UPDATED)
    @ColumnInfo(name = TIMESTAMP_LOCAL_UPDATED)
    private long localUpdatedTime;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName(LOCAL_ECG_RAW_FILE_PATH)
    @ColumnInfo(name = LOCAL_ECG_RAW_FILE_PATH)
    @NotNull
    private String localECGRawUri;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName(LOCAL_PPG_RAW_FILE_PATH)
    @ColumnInfo(name = LOCAL_PPG_RAW_FILE_PATH)
    @NotNull
    private String localPPGRawUri;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("userId")
    @ColumnInfo(defaultValue = "", name = "userId")
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @SerializedName("deviceId")
    @ColumnInfo(defaultValue = "", name = "deviceId")
    @NotNull
    private String deviceId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @SerializedName("sn")
    @ColumnInfo(defaultValue = "", name = "sn")
    @NotNull
    private String deviceSn;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName(EXTRA_STATUS)
    @ColumnInfo(name = EXTRA_STATUS)
    @Nullable
    private EcgExData extraStatus;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @SerializedName("tagValue")
    @Ignore
    @Nullable
    private String tagValue;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Ignore
    @NotNull
    private EcgReport report;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("generatedTime")
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "generatedTime")
    private long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("timeZone")
    @ColumnInfo(name = "timeZone")
    @NotNull
    private String timeZone;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("deviceSource")
    @ColumnInfo(defaultValue = "4", name = "deviceSource")
    private int deviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("type")
    @ColumnInfo(defaultValue = MeasureContentType.HEART, name = "type")
    @NotNull
    private String measureContentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(GROUP_ID)
    @ColumnInfo(defaultValue = DEFAULT_DIGIT_VALUE, name = GROUP_ID)
    private long groupId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(BIOID_MATCHED_TYPE)
    @ColumnInfo(defaultValue = BioIdMatchedType.MATCHED, name = BIOID_MATCHED_TYPE)
    @NotNull
    private String bioIdMatchedType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(BIOID_FEEDBACK)
    @ColumnInfo
    @Nullable
    private BioIdFeedback bioIdFeedback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(DIAGNOSIS)
    @ColumnInfo(name = DIAGNOSIS)
    @Nullable
    private Diagnosis diagnosis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName(MEASURE_STATE)
    @ColumnInfo(name = MEASURE_STATE)
    @NotNull
    private MeasureState measureState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("online")
    @ColumnInfo(defaultValue = "0", name = "online")
    private int measureMethodType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName(USER_ATTENTION)
    @ColumnInfo(defaultValue = "0", name = USER_ATTENTION)
    private int userAttention;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName(IS_CONTAIN_PPG)
    @ColumnInfo(defaultValue = "0", name = IS_CONTAIN_PPG)
    private int mIsContainPPG;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName(MEASURE_POSTURE)
    @ColumnInfo(defaultValue = MeasurePosture.INDOOR_STAND, name = MEASURE_POSTURE)
    @NotNull
    private String measurePosture;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName(WEAR_POSITION)
    @ColumnInfo(defaultValue = "LEFT_HAND", name = WEAR_POSITION)
    @NotNull
    private String wearPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName(SAMPLE_RATE)
    @ColumnInfo(defaultValue = "250", name = SAMPLE_RATE)
    private int sampleRate;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName(MEASURE_SECOND)
    @ColumnInfo(defaultValue = PointType.DOWNLOAD_TRACKING, name = MEASURE_SECOND)
    private long measureSecond;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName(RESULT_DATA)
    @ColumnInfo(name = RESULT_DATA)
    @NotNull
    private EcgResultData ecgResultData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName(SERVER_RAW_FILE_PATH)
    @ColumnInfo(defaultValue = "", name = SERVER_RAW_FILE_PATH)
    @NotNull
    private String serverRawUri;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @SerializedName(TIMESTAMP_SERVER_UPDATED)
    @ColumnInfo(defaultValue = DEFAULT_DIGIT_VALUE, name = TIMESTAMP_SERVER_UPDATED)
    private long serverUpdatedTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @SerializedName(ERROR_CODE)
    @ColumnInfo(defaultValue = "0", name = ERROR_CODE)
    private int mErrorCode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @SerializedName(DISEASE_TYPE)
    @ColumnInfo(name = DISEASE_TYPE)
    @Nullable
    private String diseaseType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @SerializedName(APP_NAME)
    @ColumnInfo(name = APP_NAME)
    @NotNull
    private String mSourceAppName;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @SerializedName(LOCAL_NONE_BIOID_SELF)
    @ColumnInfo(name = LOCAL_NONE_BIOID_SELF)
    private int mNoneBioIdSelf;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @SerializedName(LOCAL_EXT_FATIGUE)
    @ColumnInfo(name = LOCAL_EXT_FATIGUE)
    private int mExtFatigue;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @SerializedName(LOCAL_EXT_BPSYS)
    @ColumnInfo(name = LOCAL_EXT_BPSYS)
    private int mExtBPsys;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @SerializedName(LOCAL_EXT_BPDIAS)
    @ColumnInfo(name = LOCAL_EXT_BPDIAS)
    private int mExtBPDias;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0016\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\tR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\tR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\tR\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\tR\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\tR\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\tR\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\tR\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\tR\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\tR\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\tR\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\tR\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\tR\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\tR\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\tR\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\tR\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\tR\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\tR\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\tR\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\tR\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\t¨\u00065"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgData$Companion;", "", "", "uri", "", "a", "sPath", "isServerRawUriExisted", "APP_NAME", "Ljava/lang/String;", "BIOID_FEEDBACK", "BIOID_MATCHED_TYPE", "", "DEFAULT_DEVICE_SOURCE", LogUtil.I, "DEFAULT_DIGIT_VALUE", "DEFAULT_PATH_VALUE", "DEFAULT_VALUE_NEGTIVE", "DEFAULT_VALUE_ZERO", "DEVICE_ID", "DIAGNOSIS", "DISEASE_TYPE", "ERROR_CODE", "EXTRA_STATUS", "GROUP_ID", "IS_CONTAIN_PPG", "LOCAL_ECG_RAW_FILE_PATH", "LOCAL_EXT_BPDIAS", "LOCAL_EXT_BPSYS", "LOCAL_EXT_FATIGUE", "LOCAL_FILTER", "LOCAL_NONE_BIOID_SELF", "LOCAL_PPG_RAW_FILE_PATH", "MEASURE_CONTENT_TYPE", "MEASURE_METHOD_TYPE", "MEASURE_POSTURE", "MEASURE_SECOND", "MEASURE_STATE", "RESULT_DATA", "SAMPLE_RATE", "SERVER_RAW_FILE_PATH", "SN", "SOURCE", "THUMBNAIL_PATH", "TIMESTAMP_CREATED", "TIMESTAMP_LOCAL_UPDATED", "TIMESTAMP_SERVER_UPDATED", "TIMEZONE", "USER_ATTENTION", Constant.USER_ID, "WEAR_POSITION", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(String uri) {
            if (TextUtils.isEmpty(uri)) {
                return false;
            }
            return m.startsWith$default(uri, "https://", false, 2, null) || m.startsWith$default(uri, "http://", false, 2, null);
        }

        public final boolean isServerRawUriExisted(@NotNull String sPath) {
            return !Intrinsics.areEqual("0", sPath);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgData$ErrorCode;", "", "", "NO_ERROR", LogUtil.I, "ALGO_ECG_HRV_INVALID", "ALGO_ECG_BIOID_INVALID", "ALGO_ECG_NOISY_INVALID", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class ErrorCode {
        public static final int ALGO_ECG_BIOID_INVALID = 2;
        public static final int ALGO_ECG_HRV_INVALID = 1;
        public static final int ALGO_ECG_NOISY_INVALID = 3;
        public static final ErrorCode INSTANCE = new ErrorCode();
        public static final int NO_ERROR = 0;

        private ErrorCode() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgData$FilterCode;", "", "", NoticesEntity.LOOP_TYPE_NONE, LogUtil.I, "NOTSELF", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class FilterCode {
        public static final FilterCode INSTANCE = new FilterCode();
        public static final int NONE = 0;
        public static final int NOTSELF = 1;

        private FilterCode() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgData$NoneBioIdSelf;", "", "", "NOTSELF", LogUtil.I, "SELF", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class NoneBioIdSelf {
        public static final NoneBioIdSelf INSTANCE = new NoneBioIdSelf();
        public static final int NOTSELF = 0;
        public static final int SELF = 1;

        private NoneBioIdSelf() {
        }
    }

    public EcgData() {
        long j = -1;
        this.timestamp = j;
        this.timeZone = "";
        this.deviceSource = 4;
        this.measureContentType = MeasureContentType.HEART;
        this.groupId = j;
        this.bioIdMatchedType = BioIdMatchedType.MATCHED;
        this.measureState = new MeasureState();
        this.measurePosture = MeasurePosture.INDOOR_STAND;
        this.wearPosition = "LEFT_HAND";
        this.sampleRate = 250;
        this.measureSecond = 30L;
        this.ecgResultData = new EcgResultData();
        this.serverRawUri = "";
        this.serverUpdatedTime = j;
        this.mSourceAppName = EcgCore.INSTANCE.getAppName();
        this.mExtFatigue = -1;
        this.mExtBPsys = -1;
        this.mExtBPDias = -1;
        this.thumbnailPath = "";
        this.localUpdatedTime = j;
        this.localECGRawUri = "";
        this.localPPGRawUri = "";
        this.userId = "";
        this.deviceId = "";
        this.deviceSn = "";
        this.report = new EcgReport();
    }

    private final boolean a() {
        return EcgFileUtil.INSTANCE.fileExists(this.thumbnailPath);
    }

    public final boolean checkPPGData() {
        if (withPPG()) {
            return existPPGRawFile();
        }
        return true;
    }

    public final boolean existECGRawFile() {
        return EcgFileUtil.INSTANCE.fileExists(this.localECGRawUri);
    }

    public final boolean existPPGRawFile() {
        return EcgFileUtil.INSTANCE.fileExists(this.localPPGRawUri);
    }

    public final long getAcceleratedTime() {
        EcgExData ecgExData = this.extraStatus;
        if (ecgExData != null) {
            return ecgExData.getAcceleratedTime();
        }
        return -1L;
    }

    @Nullable
    public final AdditionalInfo getAdditionalInfo() {
        return this.ecgResultData.getAdditionalInfo();
    }

    @NotNull
    public final String getAlgoVersion() {
        return this.ecgResultData.getAlgoVersion();
    }

    @Nullable
    public final BioIdFeedback getBioIdFeedback() {
        return this.bioIdFeedback;
    }

    @NotNull
    public final String getBioIdMatchedType() {
        return this.bioIdMatchedType;
    }

    @Nullable
    public final BioIdRecord getBioIdRecord() {
        return this.ecgResultData.getBioIdRecord();
    }

    @NotNull
    public final Calendar getCalendar() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(this.timeZone));
        calendar.setTimeInMillis(this.timestamp * ((long) 1000));
        return calendar;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final Diagnosis getDiagnosis() {
        return this.diagnosis;
    }

    @NotNull
    public final EcgDiseaseRecord getDiseaseRecord() {
        return this.ecgResultData.getDiseaseRecord();
    }

    @Nullable
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    @NotNull
    public final EcgResultData getEcgResultData() {
        return this.ecgResultData;
    }

    @Nullable
    public final EcgExData getExtraStatus() {
        return this.extraStatus;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final EcgHealthRecord getHealthRecord() {
        return this.ecgResultData.getHealthRecord();
    }

    @NotNull
    public final String getLocalECGRawUri() {
        return this.localECGRawUri;
    }

    @NotNull
    public final String getLocalPPGRawUri() {
        return this.localPPGRawUri;
    }

    public final long getLocalUpdatedTime() {
        return this.localUpdatedTime;
    }

    public final int getMErrorCode() {
        return this.mErrorCode;
    }

    public final int getMExtBPDias() {
        return this.mExtBPDias;
    }

    public final int getMExtBPsys() {
        return this.mExtBPsys;
    }

    public final int getMExtFatigue() {
        return this.mExtFatigue;
    }

    public final int getMIsContainPPG() {
        return this.mIsContainPPG;
    }

    public final int getMLocalFilter() {
        return this.mLocalFilter;
    }

    public final int getMNoneBioIdSelf() {
        return this.mNoneBioIdSelf;
    }

    @NotNull
    public final String getMSourceAppName() {
        return this.mSourceAppName;
    }

    @NotNull
    public final String getMeasureContentType() {
        return this.measureContentType;
    }

    public final int getMeasureMethodType() {
        return this.measureMethodType;
    }

    @NotNull
    public final String getMeasurePosture() {
        return this.measurePosture;
    }

    public final long getMeasureSecond() {
        return this.measureSecond;
    }

    @NotNull
    public final MeasureState getMeasureState() {
        return this.measureState;
    }

    @NotNull
    public final long[] getNoisyResult() {
        return this.ecgResultData.getHealthRecord().getMNoisyResult();
    }

    @NotNull
    public final EcgReport getReport() {
        return this.report;
    }

    public final int getRrPeaks() {
        return this.ecgResultData.getHealthRecord().getRrPeaks();
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public final String getServerRawUri() {
        return this.serverRawUri;
    }

    public final long getServerUpdatedTime() {
        return this.serverUpdatedTime;
    }

    @Nullable
    public final String getTagValue() {
        return this.tagValue;
    }

    @NotNull
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getUserAttention() {
        return this.userAttention;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getWearPosition() {
        return this.wearPosition;
    }

    public final boolean isAfib() {
        return Intrinsics.areEqual(DiseaseType.AFIB, this.diseaseType);
    }

    public final boolean isContainPPG() {
        return this.mIsContainPPG == 1;
    }

    public final boolean isDiagnosisAccelerated() {
        EcgExData ecgExData = this.extraStatus;
        if (ecgExData != null) {
            return ecgExData.isDiagnosisAccelerated();
        }
        return false;
    }

    public final boolean isFeedbackSelf() {
        BioIdFeedback bioIdFeedback = this.bioIdFeedback;
        if (bioIdFeedback != null) {
            return bioIdFeedback.isMySelf();
        }
        return false;
    }

    public final boolean isNoneBioIdSelf() {
        return this.mNoneBioIdSelf == 1;
    }

    public final boolean isOnline() {
        return this.measureMethodType == 1;
    }

    public final boolean isProbe() {
        return MeasureContentType.INSTANCE.isProbe(this.measureContentType);
    }

    public final boolean isProbeFragment() {
        return MeasureContentType.INSTANCE.isProbeFragment(this.measureContentType);
    }

    public final boolean isProbeGroup() {
        return MeasureContentType.INSTANCE.isProbeGroup(this.measureContentType);
    }

    public final boolean isSelf() {
        return (Intrinsics.areEqual(BioIdMatchedType.MATCHED, this.bioIdMatchedType) && this.bioIdFeedback == null) || isFeedbackSelf();
    }

    public final boolean isServerRawUriExisted() {
        return !Intrinsics.areEqual("0", this.serverRawUri);
    }

    public final boolean isUserAttention() {
        return this.userAttention == 1;
    }

    public final void setAdditionalInfo(@Nullable AdditionalInfo additionalInfo) {
        if (additionalInfo == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.ecgResultData.setAdditionalInfo(additionalInfo);
    }

    public final void setAfib() {
        this.diseaseType = DiseaseType.AFIB;
    }

    public final void setAlgoVersion(@NotNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ecgResultData.setAlgoVersion(str);
    }

    public final void setBioIdFeedback(@Nullable BioIdFeedback bioIdFeedback) {
        this.bioIdFeedback = bioIdFeedback;
        if (bioIdFeedback == null || !bioIdFeedback.isMySelf()) {
            this.mLocalFilter = 1;
        }
    }

    public final void setBioIdMatchedType(@NotNull String str) {
        this.bioIdMatchedType = str;
    }

    public final void setBioIdRecord(@Nullable BioIdRecord bioIdRecord) {
        if (bioIdRecord == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.ecgResultData.setBioIdRecord(bioIdRecord);
    }

    public final void setCalendar(@NotNull Calendar calendar) {
        this.timestamp = calendar.getTimeInMillis() / ((long) 1000);
        this.timeZone = calendar.getTimeZone().getID();
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceSn(@NotNull String str) {
        this.deviceSn = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDiagnosis(@Nullable Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public final void setDiagnosisAccelerated() {
        if (this.extraStatus == null) {
            this.extraStatus = new EcgExData(0, 0L, 3, null);
        }
        EcgExData ecgExData = this.extraStatus;
        if (ecgExData == null) {
            Intrinsics.throwNpe();
        }
        ecgExData.setDiagnosisAccelerated();
    }

    public final void setDiseaseRecord(@NotNull EcgDiseaseRecord ecgDiseaseRecord) {
        this.ecgResultData.setDiseaseRecord(ecgDiseaseRecord);
    }

    public final void setDiseaseType(@Nullable String str) {
        this.diseaseType = str;
    }

    public final void setEcgResultData(@NotNull EcgResultData ecgResultData) {
        this.ecgResultData = ecgResultData;
    }

    public final void setExtraStatus(@Nullable EcgExData ecgExData) {
        this.extraStatus = ecgExData;
    }

    public final void setGroupId(long j) {
        this.groupId = j;
    }

    public final void setHealthRecord(@Nullable EcgHealthRecord ecgHealthRecord) {
        if (ecgHealthRecord == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.ecgResultData.setHealthRecord(ecgHealthRecord);
    }

    public final void setLocalECGRawUri(@NotNull String str) {
        this.localECGRawUri = str;
    }

    public final void setLocalPPGRawUri(@NotNull String str) {
        this.localPPGRawUri = str;
    }

    public final void setLocalUpdatedTime(long j) {
        this.localUpdatedTime = j;
    }

    public final void setMErrorCode(int i) {
        this.mErrorCode = i;
    }

    public final void setMExtBPDias(int i) {
        this.mExtBPDias = i;
    }

    public final void setMExtBPsys(int i) {
        this.mExtBPsys = i;
    }

    public final void setMExtFatigue(int i) {
        this.mExtFatigue = i;
    }

    public final void setMIsContainPPG(int i) {
        this.mIsContainPPG = i;
    }

    public final void setMLocalFilter(int i) {
        this.mLocalFilter = i;
    }

    public final void setMNoneBioIdSelf(int i) {
        this.mNoneBioIdSelf = i;
    }

    public final void setMSourceAppName(@NotNull String str) {
        this.mSourceAppName = str;
    }

    public final void setMeasureContentType(@NotNull String str) {
        this.measureContentType = str;
    }

    public final void setMeasureMethodType(int i) {
        this.measureMethodType = i;
    }

    public final void setMeasurePosture(@NotNull String str) {
        this.measurePosture = str;
    }

    public final void setMeasureSecond(long j) {
        this.measureSecond = j;
    }

    public final void setMeasureState(@NotNull MeasureState measureState) {
        this.measureState = measureState;
    }

    public final void setNoneBioIdSelf(boolean z) {
        this.mNoneBioIdSelf = z ? 1 : 0;
    }

    public final void setOnline(boolean z) {
        this.measureMethodType = z ? 1 : 0;
    }

    public final void setReport(@NotNull EcgReport ecgReport) {
        this.report = ecgReport;
    }

    public final void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public final void setSelf(boolean z) {
        BioIdFeedback bioIdFeedback = this.bioIdFeedback;
        if (bioIdFeedback == null) {
            setBioIdFeedback(new BioIdFeedback(0L, z));
            return;
        }
        if (bioIdFeedback == null) {
            Intrinsics.throwNpe();
        }
        bioIdFeedback.setOwner(z);
    }

    public final void setServerRawUri(@NotNull String str) {
        if (INSTANCE.a(str)) {
            this.serverRawUri = str;
        }
    }

    public final void setServerUpdatedTime(long j) {
        this.serverUpdatedTime = j;
    }

    public final void setSpeededTime(long speededTime) {
        if (this.extraStatus == null) {
            this.extraStatus = new EcgExData(0, 0L, 3, null);
        }
        EcgExData ecgExData = this.extraStatus;
        if (ecgExData == null) {
            Intrinsics.throwNpe();
        }
        ecgExData.setSpeededTime(speededTime);
    }

    public final void setTagValue(@Nullable String str) {
        this.tagValue = str;
    }

    public final void setThumbnailPath(@NotNull String str) {
        this.thumbnailPath = str;
    }

    public final void setTimeZone(@NotNull String str) {
        this.timeZone = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setUserAttention(int i) {
        this.userAttention = i;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setWearPosition(@NotNull String str) {
        this.wearPosition = str;
    }

    @NotNull
    public String toString() {
        return "EcgData[ " + new Gson().toJson(this) + "]";
    }

    public final boolean updateWithServer() {
        long j = this.serverUpdatedTime;
        return j > 0 && j != this.localUpdatedTime;
    }

    public final boolean withPPG() {
        return false;
    }

    public final void setBioIdMatchedType(boolean matched, boolean badECG) {
        String str;
        if (badECG) {
            str = BioIdMatchedType.BAD_ECG;
        } else {
            str = matched ? BioIdMatchedType.MATCHED : BioIdMatchedType.NOT_MATCHED;
        }
        this.bioIdMatchedType = str;
    }

    public final void setUserAttention(boolean z) {
        this.userAttention = z ? 1 : 0;
    }

    public EcgData(int i, long j) {
        long j2 = -1;
        this.timestamp = j2;
        this.timeZone = "";
        this.deviceSource = 4;
        this.measureContentType = MeasureContentType.HEART;
        this.groupId = j2;
        this.bioIdMatchedType = BioIdMatchedType.MATCHED;
        this.measureState = new MeasureState();
        this.measurePosture = MeasurePosture.INDOOR_STAND;
        this.wearPosition = "LEFT_HAND";
        this.sampleRate = 250;
        this.measureSecond = 30L;
        this.ecgResultData = new EcgResultData();
        this.serverRawUri = "";
        this.serverUpdatedTime = j2;
        this.mSourceAppName = EcgCore.INSTANCE.getAppName();
        this.mExtFatigue = -1;
        this.mExtBPsys = -1;
        this.mExtBPDias = -1;
        this.thumbnailPath = "";
        this.localUpdatedTime = j2;
        this.localECGRawUri = "";
        this.localPPGRawUri = "";
        this.userId = "";
        this.deviceId = "";
        this.deviceSn = "";
        this.report = new EcgReport();
        this.deviceSource = i;
        this.timestamp = j;
    }

    public EcgData(long j) {
        long j2 = -1;
        this.timestamp = j2;
        this.timeZone = "";
        this.deviceSource = 4;
        this.measureContentType = MeasureContentType.HEART;
        this.groupId = j2;
        this.bioIdMatchedType = BioIdMatchedType.MATCHED;
        this.measureState = new MeasureState();
        this.measurePosture = MeasurePosture.INDOOR_STAND;
        this.wearPosition = "LEFT_HAND";
        this.sampleRate = 250;
        this.measureSecond = 30L;
        this.ecgResultData = new EcgResultData();
        this.serverRawUri = "";
        this.serverUpdatedTime = j2;
        this.mSourceAppName = EcgCore.INSTANCE.getAppName();
        this.mExtFatigue = -1;
        this.mExtBPsys = -1;
        this.mExtBPDias = -1;
        this.thumbnailPath = "";
        this.localUpdatedTime = j2;
        this.localECGRawUri = "";
        this.localPPGRawUri = "";
        this.userId = "";
        this.deviceId = "";
        this.deviceSn = "";
        this.report = new EcgReport();
        this.timestamp = j;
    }

    public EcgData(long j, long j2) {
        long j3 = -1;
        this.timestamp = j3;
        this.timeZone = "";
        this.deviceSource = 4;
        this.measureContentType = MeasureContentType.HEART;
        this.groupId = j3;
        this.bioIdMatchedType = BioIdMatchedType.MATCHED;
        this.measureState = new MeasureState();
        this.measurePosture = MeasurePosture.INDOOR_STAND;
        this.wearPosition = "LEFT_HAND";
        this.sampleRate = 250;
        this.measureSecond = 30L;
        this.ecgResultData = new EcgResultData();
        this.serverRawUri = "";
        this.serverUpdatedTime = j3;
        this.mSourceAppName = EcgCore.INSTANCE.getAppName();
        this.mExtFatigue = -1;
        this.mExtBPsys = -1;
        this.mExtBPDias = -1;
        this.thumbnailPath = "";
        this.localUpdatedTime = j3;
        this.localECGRawUri = "";
        this.localPPGRawUri = "";
        this.userId = "";
        this.deviceId = "";
        this.deviceSn = "";
        this.report = new EcgReport();
        this.timestamp = j;
        this.groupId = j2;
    }
}
