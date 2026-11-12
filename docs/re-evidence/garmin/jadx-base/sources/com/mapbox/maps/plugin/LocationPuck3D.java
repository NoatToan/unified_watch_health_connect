package com.mapbox.maps.plugin;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import q6.f;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bc\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0002\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0010HÆ\u0003J\t\u0010h\u001a\u00020\u0006HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0016HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010s\u001a\u00020\u001dHÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010{\u001a\u00020\rHÆ\u0003J\t\u0010|\u001a\u00020\rHÆ\u0003J¡\u0002\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010~\u001a\u00020\u0016HÖ\u0001J\u0015\u0010\u007f\u001a\u00020\r2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001HÖ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0016HÖ\u0001J\n\u0010\u0083\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u0016HÖ\u0001R*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b:\u0010\"\u001a\u0004\b;\u00101\"\u0004\b<\u00103R&\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\"\u001a\u0004\b>\u00101\"\u0004\b?\u00103R$\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b@\u0010\"\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00105\"\u0004\bF\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00101\"\u0004\bH\u00103R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00105\"\u0004\bJ\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00101\"\u0004\bL\u00103R$\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bM\u0010\"\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00101\"\u0004\bS\u00103R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010$\"\u0004\bU\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00101\"\u0004\bW\u00103R$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bX\u0010\"\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010$\"\u0004\b^\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00101\"\u0004\b`\u00103R*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\ba\u0010\"\u001a\u0004\bb\u0010$\"\u0004\bc\u0010&R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010$\"\u0004\be\u0010&¨\u0006\u0089\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/LocationPuck3D;", "Lcom/mapbox/maps/plugin/LocationPuck;", "modelUri", "", ModelSourceWrapper.POSITION, "", "", "modelOpacity", "modelScale", "modelScaleExpression", "modelTranslation", "modelRotation", "modelCastShadows", "", "modelReceiveShadows", "modelScaleMode", "Lcom/mapbox/maps/plugin/ModelScaleMode;", "modelEmissiveStrength", "modelEmissiveStrengthExpression", "modelOpacityExpression", "modelRotationExpression", "modelColor", "", "modelColorExpression", "modelColorMixIntensity", "modelColorMixIntensityExpression", ModelSourceWrapper.MATERIAL_OVERRIDES, ModelSourceWrapper.NODE_OVERRIDES, "modelElevationReference", "Lcom/mapbox/maps/plugin/ModelElevationReference;", "modelColorUseTheme", "modelColorUseThemeExpression", "(Ljava/lang/String;Ljava/util/List;FLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/mapbox/maps/plugin/ModelScaleMode;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/mapbox/maps/plugin/ModelElevationReference;Ljava/lang/String;Ljava/lang/String;)V", "getMaterialOverrides$annotations", "()V", "getMaterialOverrides", "()Ljava/util/List;", "setMaterialOverrides", "(Ljava/util/List;)V", "getModelCastShadows$annotations", "getModelCastShadows", "()Z", "setModelCastShadows", "(Z)V", "getModelColor", "()I", "setModelColor", "(I)V", "getModelColorExpression", "()Ljava/lang/String;", "setModelColorExpression", "(Ljava/lang/String;)V", "getModelColorMixIntensity", "()F", "setModelColorMixIntensity", "(F)V", "getModelColorMixIntensityExpression", "setModelColorMixIntensityExpression", "getModelColorUseTheme$annotations", "getModelColorUseTheme", "setModelColorUseTheme", "getModelColorUseThemeExpression$annotations", "getModelColorUseThemeExpression", "setModelColorUseThemeExpression", "getModelElevationReference$annotations", "getModelElevationReference", "()Lcom/mapbox/maps/plugin/ModelElevationReference;", "setModelElevationReference", "(Lcom/mapbox/maps/plugin/ModelElevationReference;)V", "getModelEmissiveStrength", "setModelEmissiveStrength", "getModelEmissiveStrengthExpression", "setModelEmissiveStrengthExpression", "getModelOpacity", "setModelOpacity", "getModelOpacityExpression", "setModelOpacityExpression", "getModelReceiveShadows$annotations", "getModelReceiveShadows", "setModelReceiveShadows", "getModelRotation", "setModelRotation", "getModelRotationExpression", "setModelRotationExpression", "getModelScale", "setModelScale", "getModelScaleExpression", "setModelScaleExpression", "getModelScaleMode$annotations", "getModelScaleMode", "()Lcom/mapbox/maps/plugin/ModelScaleMode;", "setModelScaleMode", "(Lcom/mapbox/maps/plugin/ModelScaleMode;)V", "getModelTranslation", "setModelTranslation", "getModelUri", "setModelUri", "getNodeOverrides$annotations", "getNodeOverrides", "setNodeOverrides", "getPosition", "setPosition", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LocationPuck3D extends LocationPuck {
    public static final Parcelable.Creator<LocationPuck3D> CREATOR = new Creator();
    private List<String> materialOverrides;
    private boolean modelCastShadows;
    private int modelColor;
    private String modelColorExpression;
    private float modelColorMixIntensity;
    private String modelColorMixIntensityExpression;
    private String modelColorUseTheme;
    private String modelColorUseThemeExpression;
    private ModelElevationReference modelElevationReference;
    private float modelEmissiveStrength;
    private String modelEmissiveStrengthExpression;
    private float modelOpacity;
    private String modelOpacityExpression;
    private boolean modelReceiveShadows;
    private List<Float> modelRotation;
    private String modelRotationExpression;
    private List<Float> modelScale;
    private String modelScaleExpression;
    private ModelScaleMode modelScaleMode;
    private List<Float> modelTranslation;
    private String modelUri;
    private List<String> nodeOverrides;
    private List<Float> position;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocationPuck3D(String str, List list, float f14, List list2, String str2, List list3, List list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List list5, List list6, ModelElevationReference modelElevationReference, String str8, String str9, int i15, j jVar) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        this(str, (i15 & 2) != 0 ? x.k(fValueOf2, fValueOf2) : list, (i15 & 4) != 0 ? 1.0f : f14, (i15 & 8) != 0 ? x.k(fValueOf, fValueOf, fValueOf) : list2, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? x.k(fValueOf2, fValueOf2, fValueOf2) : list3, (i15 & 64) != 0 ? x.k(fValueOf2, fValueOf2, Float.valueOf(90.0f)) : list4, (i15 & 128) != 0 ? true : z14, (i15 & 256) == 0 ? z15 : true, (i15 & 512) != 0 ? ModelScaleMode.VIEWPORT : modelScaleMode, (i15 & 1024) == 0 ? f15 : 1.0f, (i15 & 2048) != 0 ? null : str3, (i15 & 4096) != 0 ? null : str4, (i15 & 8192) != 0 ? null : str5, (i15 & 16384) != 0 ? Color.parseColor(AnimatableModel.DEFAULT_COLOR) : i14, (i15 & 32768) != 0 ? null : str6, (i15 & 65536) != 0 ? 0.0f : f16, (i15 & 131072) != 0 ? null : str7, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? j0.f134944a : list5, (i15 & 524288) != 0 ? j0.f134944a : list6, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? ModelElevationReference.GROUND : modelElevationReference, (i15 & 2097152) != 0 ? "default" : str8, (i15 & 4194304) != 0 ? null : str9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationPuck3D copy$default(LocationPuck3D locationPuck3D, String str, List list, float f14, List list2, String str2, List list3, List list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List list5, List list6, ModelElevationReference modelElevationReference, String str8, String str9, int i15, Object obj) {
        String str10;
        String str11;
        String str12 = (i15 & 1) != 0 ? locationPuck3D.modelUri : str;
        List list7 = (i15 & 2) != 0 ? locationPuck3D.position : list;
        float f17 = (i15 & 4) != 0 ? locationPuck3D.modelOpacity : f14;
        List list8 = (i15 & 8) != 0 ? locationPuck3D.modelScale : list2;
        String str13 = (i15 & 16) != 0 ? locationPuck3D.modelScaleExpression : str2;
        List list9 = (i15 & 32) != 0 ? locationPuck3D.modelTranslation : list3;
        List list10 = (i15 & 64) != 0 ? locationPuck3D.modelRotation : list4;
        boolean z16 = (i15 & 128) != 0 ? locationPuck3D.modelCastShadows : z14;
        boolean z17 = (i15 & 256) != 0 ? locationPuck3D.modelReceiveShadows : z15;
        ModelScaleMode modelScaleMode2 = (i15 & 512) != 0 ? locationPuck3D.modelScaleMode : modelScaleMode;
        float f18 = (i15 & 1024) != 0 ? locationPuck3D.modelEmissiveStrength : f15;
        String str14 = (i15 & 2048) != 0 ? locationPuck3D.modelEmissiveStrengthExpression : str3;
        String str15 = (i15 & 4096) != 0 ? locationPuck3D.modelOpacityExpression : str4;
        String str16 = (i15 & 8192) != 0 ? locationPuck3D.modelRotationExpression : str5;
        String str17 = str12;
        int i16 = (i15 & 16384) != 0 ? locationPuck3D.modelColor : i14;
        String str18 = (i15 & 32768) != 0 ? locationPuck3D.modelColorExpression : str6;
        float f19 = (i15 & 65536) != 0 ? locationPuck3D.modelColorMixIntensity : f16;
        String str19 = (i15 & 131072) != 0 ? locationPuck3D.modelColorMixIntensityExpression : str7;
        List list11 = (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? locationPuck3D.materialOverrides : list5;
        List list12 = (i15 & 524288) != 0 ? locationPuck3D.nodeOverrides : list6;
        ModelElevationReference modelElevationReference2 = (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? locationPuck3D.modelElevationReference : modelElevationReference;
        String str20 = (i15 & 2097152) != 0 ? locationPuck3D.modelColorUseTheme : str8;
        if ((i15 & 4194304) != 0) {
            str11 = str20;
            str10 = locationPuck3D.modelColorUseThemeExpression;
        } else {
            str10 = str9;
            str11 = str20;
        }
        return locationPuck3D.copy(str17, list7, f17, list8, str13, list9, list10, z16, z17, modelScaleMode2, f18, str14, str15, str16, i16, str18, f19, str19, list11, list12, modelElevationReference2, str11, str10);
    }

    @MapboxExperimental
    public static /* synthetic */ void getMaterialOverrides$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelCastShadows$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelColorUseThemeExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelReceiveShadows$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getModelScaleMode$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getNodeOverrides$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModelUri() {
        return this.modelUri;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ModelScaleMode getModelScaleMode() {
        return this.modelScaleMode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getModelEmissiveStrength() {
        return this.modelEmissiveStrength;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getModelEmissiveStrengthExpression() {
        return this.modelEmissiveStrengthExpression;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getModelOpacityExpression() {
        return this.modelOpacityExpression;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getModelRotationExpression() {
        return this.modelRotationExpression;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getModelColor() {
        return this.modelColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getModelColorExpression() {
        return this.modelColorExpression;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getModelColorMixIntensity() {
        return this.modelColorMixIntensity;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getModelColorMixIntensityExpression() {
        return this.modelColorMixIntensityExpression;
    }

    public final List<String> component19() {
        return this.materialOverrides;
    }

    public final List<Float> component2() {
        return this.position;
    }

    public final List<String> component20() {
        return this.nodeOverrides;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ModelElevationReference getModelElevationReference() {
        return this.modelElevationReference;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getModelColorUseTheme() {
        return this.modelColorUseTheme;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getModelColorUseThemeExpression() {
        return this.modelColorUseThemeExpression;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getModelOpacity() {
        return this.modelOpacity;
    }

    public final List<Float> component4() {
        return this.modelScale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModelScaleExpression() {
        return this.modelScaleExpression;
    }

    public final List<Float> component6() {
        return this.modelTranslation;
    }

    public final List<Float> component7() {
        return this.modelRotation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getModelCastShadows() {
        return this.modelCastShadows;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getModelReceiveShadows() {
        return this.modelReceiveShadows;
    }

    public final LocationPuck3D copy(String modelUri, List<Float> position, float modelOpacity, List<Float> modelScale, String modelScaleExpression, List<Float> modelTranslation, List<Float> modelRotation, boolean modelCastShadows, boolean modelReceiveShadows, ModelScaleMode modelScaleMode, float modelEmissiveStrength, String modelEmissiveStrengthExpression, String modelOpacityExpression, String modelRotationExpression, int modelColor, String modelColorExpression, float modelColorMixIntensity, String modelColorMixIntensityExpression, List<String> materialOverrides, List<String> nodeOverrides, ModelElevationReference modelElevationReference, String modelColorUseTheme, String modelColorUseThemeExpression) {
        n23.j.x(modelUri, position, modelScale, modelTranslation, modelRotation);
        modelScaleMode.getClass();
        materialOverrides.getClass();
        nodeOverrides.getClass();
        modelElevationReference.getClass();
        modelColorUseTheme.getClass();
        return new LocationPuck3D(modelUri, position, modelOpacity, modelScale, modelScaleExpression, modelTranslation, modelRotation, modelCastShadows, modelReceiveShadows, modelScaleMode, modelEmissiveStrength, modelEmissiveStrengthExpression, modelOpacityExpression, modelRotationExpression, modelColor, modelColorExpression, modelColorMixIntensity, modelColorMixIntensityExpression, materialOverrides, nodeOverrides, modelElevationReference, modelColorUseTheme, modelColorUseThemeExpression);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationPuck3D)) {
            return false;
        }
        LocationPuck3D locationPuck3D = (LocationPuck3D) other;
        return s.g(this.modelUri, locationPuck3D.modelUri) && s.g(this.position, locationPuck3D.position) && Float.compare(this.modelOpacity, locationPuck3D.modelOpacity) == 0 && s.g(this.modelScale, locationPuck3D.modelScale) && s.g(this.modelScaleExpression, locationPuck3D.modelScaleExpression) && s.g(this.modelTranslation, locationPuck3D.modelTranslation) && s.g(this.modelRotation, locationPuck3D.modelRotation) && this.modelCastShadows == locationPuck3D.modelCastShadows && this.modelReceiveShadows == locationPuck3D.modelReceiveShadows && this.modelScaleMode == locationPuck3D.modelScaleMode && Float.compare(this.modelEmissiveStrength, locationPuck3D.modelEmissiveStrength) == 0 && s.g(this.modelEmissiveStrengthExpression, locationPuck3D.modelEmissiveStrengthExpression) && s.g(this.modelOpacityExpression, locationPuck3D.modelOpacityExpression) && s.g(this.modelRotationExpression, locationPuck3D.modelRotationExpression) && this.modelColor == locationPuck3D.modelColor && s.g(this.modelColorExpression, locationPuck3D.modelColorExpression) && Float.compare(this.modelColorMixIntensity, locationPuck3D.modelColorMixIntensity) == 0 && s.g(this.modelColorMixIntensityExpression, locationPuck3D.modelColorMixIntensityExpression) && s.g(this.materialOverrides, locationPuck3D.materialOverrides) && s.g(this.nodeOverrides, locationPuck3D.nodeOverrides) && this.modelElevationReference == locationPuck3D.modelElevationReference && s.g(this.modelColorUseTheme, locationPuck3D.modelColorUseTheme) && s.g(this.modelColorUseThemeExpression, locationPuck3D.modelColorUseThemeExpression);
    }

    public final List<String> getMaterialOverrides() {
        return this.materialOverrides;
    }

    public final boolean getModelCastShadows() {
        return this.modelCastShadows;
    }

    public final int getModelColor() {
        return this.modelColor;
    }

    public final String getModelColorExpression() {
        return this.modelColorExpression;
    }

    public final float getModelColorMixIntensity() {
        return this.modelColorMixIntensity;
    }

    public final String getModelColorMixIntensityExpression() {
        return this.modelColorMixIntensityExpression;
    }

    public final String getModelColorUseTheme() {
        return this.modelColorUseTheme;
    }

    public final String getModelColorUseThemeExpression() {
        return this.modelColorUseThemeExpression;
    }

    public final ModelElevationReference getModelElevationReference() {
        return this.modelElevationReference;
    }

    public final float getModelEmissiveStrength() {
        return this.modelEmissiveStrength;
    }

    public final String getModelEmissiveStrengthExpression() {
        return this.modelEmissiveStrengthExpression;
    }

    public final float getModelOpacity() {
        return this.modelOpacity;
    }

    public final String getModelOpacityExpression() {
        return this.modelOpacityExpression;
    }

    public final boolean getModelReceiveShadows() {
        return this.modelReceiveShadows;
    }

    public final List<Float> getModelRotation() {
        return this.modelRotation;
    }

    public final String getModelRotationExpression() {
        return this.modelRotationExpression;
    }

    public final List<Float> getModelScale() {
        return this.modelScale;
    }

    public final String getModelScaleExpression() {
        return this.modelScaleExpression;
    }

    public final ModelScaleMode getModelScaleMode() {
        return this.modelScaleMode;
    }

    public final List<Float> getModelTranslation() {
        return this.modelTranslation;
    }

    public final String getModelUri() {
        return this.modelUri;
    }

    public final List<String> getNodeOverrides() {
        return this.nodeOverrides;
    }

    public final List<Float> getPosition() {
        return this.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iB = u0.b(f.d(this.modelOpacity, u0.b(this.modelUri.hashCode() * 31, 31, this.position), 31), 31, this.modelScale);
        String str = this.modelScaleExpression;
        int iB2 = u0.b(u0.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.modelTranslation), 31, this.modelRotation);
        boolean z14 = this.modelCastShadows;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iB2 + r14) * 31;
        boolean z15 = this.modelReceiveShadows;
        int iD = f.d(this.modelEmissiveStrength, (this.modelScaleMode.hashCode() + ((i14 + (z15 ? 1 : z15)) * 31)) * 31, 31);
        String str2 = this.modelEmissiveStrengthExpression;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelOpacityExpression;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.modelRotationExpression;
        int iD2 = q2.d(this.modelColor, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.modelColorExpression;
        int iD3 = f.d(this.modelColorMixIntensity, (iD2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.modelColorMixIntensityExpression;
        int iJ = g.j((this.modelElevationReference.hashCode() + u0.b(u0.b((iD3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.materialOverrides), 31, this.nodeOverrides)) * 31, 31, this.modelColorUseTheme);
        String str7 = this.modelColorUseThemeExpression;
        return iJ + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setMaterialOverrides(List<String> list) {
        list.getClass();
        this.materialOverrides = list;
    }

    public final void setModelCastShadows(boolean z14) {
        this.modelCastShadows = z14;
    }

    public final void setModelColor(int i14) {
        this.modelColor = i14;
    }

    public final void setModelColorExpression(String str) {
        this.modelColorExpression = str;
    }

    public final void setModelColorMixIntensity(float f14) {
        this.modelColorMixIntensity = f14;
    }

    public final void setModelColorMixIntensityExpression(String str) {
        this.modelColorMixIntensityExpression = str;
    }

    public final void setModelColorUseTheme(String str) {
        str.getClass();
        this.modelColorUseTheme = str;
    }

    public final void setModelColorUseThemeExpression(String str) {
        this.modelColorUseThemeExpression = str;
    }

    public final void setModelElevationReference(ModelElevationReference modelElevationReference) {
        modelElevationReference.getClass();
        this.modelElevationReference = modelElevationReference;
    }

    public final void setModelEmissiveStrength(float f14) {
        this.modelEmissiveStrength = f14;
    }

    public final void setModelEmissiveStrengthExpression(String str) {
        this.modelEmissiveStrengthExpression = str;
    }

    public final void setModelOpacity(float f14) {
        this.modelOpacity = f14;
    }

    public final void setModelOpacityExpression(String str) {
        this.modelOpacityExpression = str;
    }

    public final void setModelReceiveShadows(boolean z14) {
        this.modelReceiveShadows = z14;
    }

    public final void setModelRotation(List<Float> list) {
        list.getClass();
        this.modelRotation = list;
    }

    public final void setModelRotationExpression(String str) {
        this.modelRotationExpression = str;
    }

    public final void setModelScale(List<Float> list) {
        list.getClass();
        this.modelScale = list;
    }

    public final void setModelScaleExpression(String str) {
        this.modelScaleExpression = str;
    }

    public final void setModelScaleMode(ModelScaleMode modelScaleMode) {
        modelScaleMode.getClass();
        this.modelScaleMode = modelScaleMode;
    }

    public final void setModelTranslation(List<Float> list) {
        list.getClass();
        this.modelTranslation = list;
    }

    public final void setModelUri(String str) {
        str.getClass();
        this.modelUri = str;
    }

    public final void setNodeOverrides(List<String> list) {
        list.getClass();
        this.nodeOverrides = list;
    }

    public final void setPosition(List<Float> list) {
        list.getClass();
        this.position = list;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LocationPuck3D(modelUri=");
        sb3.append(this.modelUri);
        sb3.append(", position=");
        sb3.append(this.position);
        sb3.append(", modelOpacity=");
        sb3.append(this.modelOpacity);
        sb3.append(", modelScale=");
        sb3.append(this.modelScale);
        sb3.append(", modelScaleExpression=");
        sb3.append(this.modelScaleExpression);
        sb3.append(", modelTranslation=");
        sb3.append(this.modelTranslation);
        sb3.append(", modelRotation=");
        sb3.append(this.modelRotation);
        sb3.append(", modelCastShadows=");
        sb3.append(this.modelCastShadows);
        sb3.append(", modelReceiveShadows=");
        sb3.append(this.modelReceiveShadows);
        sb3.append(", modelScaleMode=");
        sb3.append(this.modelScaleMode);
        sb3.append(", modelEmissiveStrength=");
        sb3.append(this.modelEmissiveStrength);
        sb3.append(", modelEmissiveStrengthExpression=");
        sb3.append(this.modelEmissiveStrengthExpression);
        sb3.append(", modelOpacityExpression=");
        sb3.append(this.modelOpacityExpression);
        sb3.append(", modelRotationExpression=");
        sb3.append(this.modelRotationExpression);
        sb3.append(", modelColor=");
        sb3.append(this.modelColor);
        sb3.append(", modelColorExpression=");
        sb3.append(this.modelColorExpression);
        sb3.append(", modelColorMixIntensity=");
        sb3.append(this.modelColorMixIntensity);
        sb3.append(", modelColorMixIntensityExpression=");
        sb3.append(this.modelColorMixIntensityExpression);
        sb3.append(", materialOverrides=");
        sb3.append(this.materialOverrides);
        sb3.append(", nodeOverrides=");
        sb3.append(this.nodeOverrides);
        sb3.append(", modelElevationReference=");
        sb3.append(this.modelElevationReference);
        sb3.append(", modelColorUseTheme=");
        sb3.append(this.modelColorUseTheme);
        sb3.append(", modelColorUseThemeExpression=");
        return a0.m(sb3, this.modelColorUseThemeExpression, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.modelUri);
        Iterator itE = kg.f.e(this.position, parcel);
        while (itE.hasNext()) {
            parcel.writeFloat(((Number) itE.next()).floatValue());
        }
        parcel.writeFloat(this.modelOpacity);
        Iterator itE2 = kg.f.e(this.modelScale, parcel);
        while (itE2.hasNext()) {
            parcel.writeFloat(((Number) itE2.next()).floatValue());
        }
        parcel.writeString(this.modelScaleExpression);
        Iterator itE3 = kg.f.e(this.modelTranslation, parcel);
        while (itE3.hasNext()) {
            parcel.writeFloat(((Number) itE3.next()).floatValue());
        }
        Iterator itE4 = kg.f.e(this.modelRotation, parcel);
        while (itE4.hasNext()) {
            parcel.writeFloat(((Number) itE4.next()).floatValue());
        }
        parcel.writeInt(this.modelCastShadows ? 1 : 0);
        parcel.writeInt(this.modelReceiveShadows ? 1 : 0);
        parcel.writeString(this.modelScaleMode.name());
        parcel.writeFloat(this.modelEmissiveStrength);
        parcel.writeString(this.modelEmissiveStrengthExpression);
        parcel.writeString(this.modelOpacityExpression);
        parcel.writeString(this.modelRotationExpression);
        parcel.writeInt(this.modelColor);
        parcel.writeString(this.modelColorExpression);
        parcel.writeFloat(this.modelColorMixIntensity);
        parcel.writeString(this.modelColorMixIntensityExpression);
        parcel.writeStringList(this.materialOverrides);
        parcel.writeStringList(this.nodeOverrides);
        parcel.writeString(this.modelElevationReference.name());
        parcel.writeString(this.modelColorUseTheme);
        parcel.writeString(this.modelColorUseThemeExpression);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationPuck3D> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationPuck3D createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            float f14 = parcel.readFloat();
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(Float.valueOf(parcel.readFloat()));
            }
            String string2 = parcel.readString();
            int i18 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                arrayList3.add(Float.valueOf(parcel.readFloat()));
            }
            int i24 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i24);
            for (int i25 = 0; i25 != i24; i25++) {
                arrayList4.add(Float.valueOf(parcel.readFloat()));
            }
            return new LocationPuck3D(string, arrayList, f14, arrayList2, string2, arrayList3, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0, ModelScaleMode.valueOf(parcel.readString()), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), ModelElevationReference.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationPuck3D[] newArray(int i14) {
            return new LocationPuck3D[i14];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list) {
        this(str, list, 0.0f, null, null, null, null, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388604, null);
        str.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14) {
        this(str, list, f14, null, null, null, null, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388600, null);
        str.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2) {
        this(str, list, f14, list2, null, null, null, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388592, null);
        str.getClass();
        list.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2) {
        this(str, list, f14, list2, str2, null, null, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388576, null);
        str.getClass();
        list.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3) {
        this(str, list, f14, list2, str2, list3, null, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388544, null);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4) {
        this(str, list, f14, list2, str2, list3, list4, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388480, null);
        n23.j.x(str, list, list2, list3, list4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14) {
        this(str, list, f14, list2, str2, list3, list4, z14, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388352, null);
        n23.j.x(str, list, list2, list3, list4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388096, null);
        n23.j.x(str, list, list2, list3, list4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8387584, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8386560, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8384512, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, null, 0, null, 0.0f, null, null, null, null, null, null, 8380416, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, 0, null, 0.0f, null, null, null, null, null, null, 8372224, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, null, 0.0f, null, null, null, null, null, null, 8355840, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, 0.0f, null, null, null, null, null, null, 8323072, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, f16, null, null, null, null, null, null, 8257536, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, f16, str7, null, null, null, null, null, 8126464, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List<String> list5) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, f16, str7, list5, null, null, null, null, 7864320, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
        list5.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List<String> list5, List<String> list6) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, f16, str7, list5, list6, null, null, null, 7340032, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
        list5.getClass();
        list6.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List<String> list5, List<String> list6, ModelElevationReference modelElevationReference) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, f16, str7, list5, list6, modelElevationReference, null, null, 6291456, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
        list5.getClass();
        list6.getClass();
        modelElevationReference.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List<String> list5, List<String> list6, ModelElevationReference modelElevationReference, String str8) {
        this(str, list, f14, list2, str2, list3, list4, z14, z15, modelScaleMode, f15, str3, str4, str5, i14, str6, f16, str7, list5, list6, modelElevationReference, str8, null, 4194304, null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
        list5.getClass();
        list6.getClass();
        modelElevationReference.getClass();
        str8.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str, List<Float> list, float f14, List<Float> list2, String str2, List<Float> list3, List<Float> list4, boolean z14, boolean z15, ModelScaleMode modelScaleMode, float f15, String str3, String str4, String str5, int i14, String str6, float f16, String str7, List<String> list5, List<String> list6, ModelElevationReference modelElevationReference, String str8, String str9) {
        super(null);
        n23.j.x(str, list, list2, list3, list4);
        modelScaleMode.getClass();
        list5.getClass();
        list6.getClass();
        modelElevationReference.getClass();
        str8.getClass();
        this.modelUri = str;
        this.position = list;
        this.modelOpacity = f14;
        this.modelScale = list2;
        this.modelScaleExpression = str2;
        this.modelTranslation = list3;
        this.modelRotation = list4;
        this.modelCastShadows = z14;
        this.modelReceiveShadows = z15;
        this.modelScaleMode = modelScaleMode;
        this.modelEmissiveStrength = f15;
        this.modelEmissiveStrengthExpression = str3;
        this.modelOpacityExpression = str4;
        this.modelRotationExpression = str5;
        this.modelColor = i14;
        this.modelColorExpression = str6;
        this.modelColorMixIntensity = f16;
        this.modelColorMixIntensityExpression = str7;
        this.materialOverrides = list5;
        this.nodeOverrides = list6;
        this.modelElevationReference = modelElevationReference;
        this.modelColorUseTheme = str8;
        this.modelColorUseThemeExpression = str9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPuck3D(String str) {
        this(str, null, 0.0f, null, null, null, null, false, false, null, 0.0f, null, null, null, 0, null, 0.0f, null, null, null, null, null, null, 8388606, null);
        str.getClass();
    }
}
