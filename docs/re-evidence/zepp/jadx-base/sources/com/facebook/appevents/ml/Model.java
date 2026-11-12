package com.facebook.appevents.ml;

import androidx.annotation.RestrictTo;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\b\u0002\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020%¢\u0006\u0004\b'\u0010(J-\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/facebook/appevents/ml/Model;", "", "Lcom/facebook/appevents/ml/MTensor;", "dense", "", "", "texts", "task", "predictOnMTML", "(Lcom/facebook/appevents/ml/MTensor;[Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/appevents/ml/MTensor;", "a", "Lcom/facebook/appevents/ml/MTensor;", "embedding", "b", "convs0Weight", "c", "convs1Weight", GoogleApiAvailabilityLight.a, "convs2Weight", "e", "convs0Bias", "f", "convs1Bias", "g", "convs2Bias", "h", "fc1Weight", "i", "fc2Weight", z.j, "fc1Bias", hl.k, "fc2Bias", "", "l", "Ljava/util/Map;", "finalWeights", "", "weights", "<init>", "(Ljava/util/Map;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Model {
    private static final int m = 128;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MTensor embedding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MTensor convs0Weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MTensor convs1Weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final MTensor convs2Weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final MTensor convs0Bias;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final MTensor convs1Bias;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final MTensor convs2Bias;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final MTensor fc1Weight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final MTensor fc2Weight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final MTensor fc1Bias;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final MTensor fc2Bias;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Map<String, MTensor> finalWeights;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, String> n = r.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/ml/Model$Companion;", "", "Ljava/io/File;", "file", "", "", "Lcom/facebook/appevents/ml/MTensor;", "a", "Lcom/facebook/appevents/ml/Model;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "SEQ_LEN", LogUtil.I, "mapping", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        private final Map<String, MTensor> a(File file) {
            Map<String, MTensor> modelWeights = Utils.parseModelWeights(file);
            if (modelWeights == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapAccess$getMapping$cp = Model.access$getMapping$cp();
            for (Map.Entry<String, MTensor> entry : modelWeights.entrySet()) {
                String key = entry.getKey();
                if (mapAccess$getMapping$cp.containsKey(entry.getKey()) && (key = (String) mapAccess$getMapping$cp.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }

        @Nullable
        public final Model build(@NotNull File file) {
            Map<String, MTensor> mapA = a(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapA != null) {
                try {
                    return new Model(mapA, defaultConstructorMarker);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Model(Map<String, MTensor> map) {
        MTensor mTensor = map.get("embed.weight");
        if (mTensor == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.embedding = mTensor;
        MTensor mTensor2 = map.get("convs.0.weight");
        if (mTensor2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs0Weight = Operator.transpose3D(mTensor2);
        MTensor mTensor3 = map.get("convs.1.weight");
        if (mTensor3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs1Weight = Operator.transpose3D(mTensor3);
        MTensor mTensor4 = map.get("convs.2.weight");
        if (mTensor4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs2Weight = Operator.transpose3D(mTensor4);
        MTensor mTensor5 = map.get("convs.0.bias");
        if (mTensor5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs0Bias = mTensor5;
        MTensor mTensor6 = map.get("convs.1.bias");
        if (mTensor6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs1Bias = mTensor6;
        MTensor mTensor7 = map.get("convs.2.bias");
        if (mTensor7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs2Bias = mTensor7;
        MTensor mTensor8 = map.get("fc1.weight");
        if (mTensor8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc1Weight = Operator.transpose2D(mTensor8);
        MTensor mTensor9 = map.get("fc2.weight");
        if (mTensor9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc2Weight = Operator.transpose2D(mTensor9);
        MTensor mTensor10 = map.get("fc1.bias");
        if (mTensor10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc1Bias = mTensor10;
        MTensor mTensor11 = map.get("fc2.bias");
        if (mTensor11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc2Bias = mTensor11;
        this.finalWeights = new HashMap();
        for (String str : y.setOf((Object[]) new String[]{ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            MTensor mTensor12 = map.get(str2);
            MTensor mTensor13 = map.get(str3);
            if (mTensor12 != null) {
                this.finalWeights.put(str2, Operator.transpose2D(mTensor12));
            }
            if (mTensor13 != null) {
                this.finalWeights.put(str3, mTensor13);
            }
        }
    }

    public static final /* synthetic */ Map access$getMapping$cp() {
        if (CrashShieldHandler.isObjectCrashing(Model.class)) {
            return null;
        }
        try {
            return n;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Model.class);
            return null;
        }
    }

    @Nullable
    public final MTensor predictOnMTML(@NotNull MTensor dense, @NotNull String[] texts, @NotNull String task) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            MTensor mTensorConv1D = Operator.conv1D(Operator.embedding(texts, 128, this.embedding), this.convs0Weight);
            Operator.addmv(mTensorConv1D, this.convs0Bias);
            Operator.relu(mTensorConv1D);
            MTensor mTensorConv1D2 = Operator.conv1D(mTensorConv1D, this.convs1Weight);
            Operator.addmv(mTensorConv1D2, this.convs1Bias);
            Operator.relu(mTensorConv1D2);
            MTensor mTensorMaxPool1D = Operator.maxPool1D(mTensorConv1D2, 2);
            MTensor mTensorConv1D3 = Operator.conv1D(mTensorMaxPool1D, this.convs2Weight);
            Operator.addmv(mTensorConv1D3, this.convs2Bias);
            Operator.relu(mTensorConv1D3);
            MTensor mTensorMaxPool1D2 = Operator.maxPool1D(mTensorConv1D, mTensorConv1D.getShape(1));
            MTensor mTensorMaxPool1D3 = Operator.maxPool1D(mTensorMaxPool1D, mTensorMaxPool1D.getShape(1));
            MTensor mTensorMaxPool1D4 = Operator.maxPool1D(mTensorConv1D3, mTensorConv1D3.getShape(1));
            Operator.flatten(mTensorMaxPool1D2, 1);
            Operator.flatten(mTensorMaxPool1D3, 1);
            Operator.flatten(mTensorMaxPool1D4, 1);
            MTensor mTensorDense = Operator.dense(Operator.concatenate(new MTensor[]{mTensorMaxPool1D2, mTensorMaxPool1D3, mTensorMaxPool1D4, dense}), this.fc1Weight, this.fc1Bias);
            Operator.relu(mTensorDense);
            MTensor mTensorDense2 = Operator.dense(mTensorDense, this.fc2Weight, this.fc2Bias);
            Operator.relu(mTensorDense2);
            MTensor mTensor = this.finalWeights.get(task + ".weight");
            MTensor mTensor2 = this.finalWeights.get(task + ".bias");
            if (mTensor != null && mTensor2 != null) {
                MTensor mTensorDense3 = Operator.dense(mTensorDense2, mTensor, mTensor2);
                Operator.softmax(mTensorDense3);
                return mTensorDense3;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public /* synthetic */ Model(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
