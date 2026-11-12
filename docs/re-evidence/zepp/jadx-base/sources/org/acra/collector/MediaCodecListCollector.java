package org.acra.collector;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class MediaCodecListCollector extends BaseReportFieldCollector {
    private static final String COLOR_FORMAT_PREFIX = "COLOR_";
    private final SparseArray<String> mAACProfileValues;
    private final SparseArray<String> mAVCLevelValues;
    private final SparseArray<String> mAVCProfileValues;
    private final SparseArray<String> mColorFormatValues;
    private final SparseArray<String> mH263LevelValues;
    private final SparseArray<String> mH263ProfileValues;
    private final SparseArray<String> mMPEG4LevelValues;
    private final SparseArray<String> mMPEG4ProfileValues;
    private static final String[] MPEG4_TYPES = {TrainingWebConst.Value.VideoFormat.MP4, "mpeg4", "MP4", "MPEG4"};
    private static final String[] AVC_TYPES = {"avc", "h264", "AVC", "H264"};
    private static final String[] H263_TYPES = {"h263", "H263"};
    private static final String[] AAC_TYPES = {"aac", "AAC"};

    public enum CodecType {
        AVC,
        H263,
        MPEG4,
        AAC
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CodecType.values().length];
            a = iArr;
            try {
                iArr[CodecType.AVC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CodecType.H263.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CodecType.MPEG4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CodecType.AAC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MediaCodecListCollector() {
        super(ReportField.MEDIA_CODEC_LIST, new ReportField[0]);
        this.mColorFormatValues = new SparseArray<>();
        this.mAVCLevelValues = new SparseArray<>();
        this.mAVCProfileValues = new SparseArray<>();
        this.mH263LevelValues = new SparseArray<>();
        this.mH263ProfileValues = new SparseArray<>();
        this.mMPEG4LevelValues = new SparseArray<>();
        this.mMPEG4ProfileValues = new SparseArray<>();
        this.mAACProfileValues = new SparseArray<>();
    }

    @NonNull
    @TargetApi(16)
    private JSONObject collectCapabilitiesForType(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int[] iArr = capabilitiesForType.colorFormats;
        if (iArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(this.mColorFormatValues.get(i));
            }
            jSONObject.put("colorFormats", jSONArray);
        }
        CodecType codecTypeIdentifyCodecType = identifyCodecType(mediaCodecInfo);
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
        if (codecProfileLevelArr.length > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                int i2 = codecProfileLevel.profile;
                int i3 = codecProfileLevel.level;
                if (codecTypeIdentifyCodecType == null) {
                    jSONArray2.put(i2 + 45 + i3);
                    break;
                }
                int i4 = a.a[codecTypeIdentifyCodecType.ordinal()];
                if (i4 == 1) {
                    jSONArray2.put(i2 + this.mAVCProfileValues.get(i2) + '-' + this.mAVCLevelValues.get(i3));
                } else if (i4 == 2) {
                    jSONArray2.put(this.mH263ProfileValues.get(i2) + '-' + this.mH263LevelValues.get(i3));
                } else if (i4 == 3) {
                    jSONArray2.put(this.mMPEG4ProfileValues.get(i2) + '-' + this.mMPEG4LevelValues.get(i3));
                } else if (i4 == 4) {
                    jSONArray2.put(this.mAACProfileValues.get(i2));
                }
            }
            jSONObject.put("profileLevels", jSONArray2);
        }
        return jSONObject;
    }

    @NonNull
    @TargetApi(16)
    private JSONObject collectMediaCodecList() throws JSONException {
        MediaCodecInfo[] codecInfos;
        prepare();
        if (Build.VERSION.SDK_INT < 21) {
            int codecCount = MediaCodecList.getCodecCount();
            codecInfos = new MediaCodecInfo[codecCount];
            for (int i = 0; i < codecCount; i++) {
                codecInfos[i] = MediaCodecList.getCodecInfoAt(i);
            }
        } else {
            codecInfos = new MediaCodecList(1).getCodecInfos();
        }
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < codecInfos.length; i2++) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i2];
            JSONObject jSONObject2 = new JSONObject();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            jSONObject2.put("name", mediaCodecInfo.getName()).put("isEncoder", mediaCodecInfo.isEncoder());
            JSONObject jSONObject3 = new JSONObject();
            for (String str : supportedTypes) {
                jSONObject3.put(str, collectCapabilitiesForType(mediaCodecInfo, str));
            }
            jSONObject2.put("supportedTypes", jSONObject3);
            jSONObject.put(String.valueOf(i2), jSONObject2);
        }
        return jSONObject;
    }

    @Nullable
    @TargetApi(16)
    private CodecType identifyCodecType(@NonNull MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        for (String str : AVC_TYPES) {
            if (name.contains(str)) {
                return CodecType.AVC;
            }
        }
        for (String str2 : H263_TYPES) {
            if (name.contains(str2)) {
                return CodecType.H263;
            }
        }
        for (String str3 : MPEG4_TYPES) {
            if (name.contains(str3)) {
                return CodecType.MPEG4;
            }
        }
        for (String str4 : AAC_TYPES) {
            if (name.contains(str4)) {
                return CodecType.AAC;
            }
        }
        return null;
    }

    private void prepare() {
        try {
            for (Field field : Class.forName("android.media.MediaCodecInfo$CodecCapabilities").getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) && field.getName().startsWith(COLOR_FORMAT_PREFIX)) {
                    this.mColorFormatValues.put(field.getInt(null), field.getName());
                }
            }
            for (Field field2 : Class.forName("android.media.MediaCodecInfo$CodecProfileLevel").getFields()) {
                if (Modifier.isStatic(field2.getModifiers()) && Modifier.isFinal(field2.getModifiers())) {
                    if (field2.getName().startsWith("AVCLevel")) {
                        this.mAVCLevelValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("AVCProfile")) {
                        this.mAVCProfileValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("H263Level")) {
                        this.mH263LevelValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("H263Profile")) {
                        this.mH263ProfileValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("MPEG4Level")) {
                        this.mMPEG4LevelValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("MPEG4Profile")) {
                        this.mMPEG4ProfileValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("AAC")) {
                        this.mAACProfileValues.put(field2.getInt(null), field2.getName());
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | SecurityException unused) {
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws JSONException {
        crashReportData.put(ReportField.MEDIA_CODEC_LIST, collectMediaCodecList());
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    @NonNull
    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportField reportField, @NonNull ReportBuilder reportBuilder) {
        return super.shouldCollect(context, coreConfiguration, reportField, reportBuilder) && Build.VERSION.SDK_INT >= 16;
    }
}
