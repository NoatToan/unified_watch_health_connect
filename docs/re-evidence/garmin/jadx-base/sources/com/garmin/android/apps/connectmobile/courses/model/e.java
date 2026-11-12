package com.garmin.android.apps.connectmobile.courses.model;

import am.x0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.k;
import c22.s3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.m0;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bb\b\u0007\u0018\u0000 ¢\u00012\u00020\u0001:\u0002GDB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bBë\u0003\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010,\u001a\u00020\u0010\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010\f\u0012\b\u00101\u001a\u0004\u0018\u00010\f\u0012\b\u00102\u001a\u0004\u0018\u00010\f\u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010#\u0012\b\u00105\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u00010\f\u0012\b\u00107\u001a\u0004\u0018\u00010\f\u0012\b\u00108\u001a\u0004\u0018\u00010\f\u0012\b\u00109\u001a\u0004\u0018\u00010\f\u0012\b\u0010:\u001a\u0004\u0018\u00010\f\u0012\b\u0010;\u001a\u0004\u0018\u00010\f\u0012\b\u0010<\u001a\u0004\u0018\u00010\t\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010#\u0012\u0006\u0010@\u001a\u00020\t\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b\u0002\u0010CR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010ER$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010ER\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010ER$\u0010\u0015\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010E\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010E\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R$\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010E\u001a\u0004\ba\u0010Z\"\u0004\bb\u0010\\R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010E\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010E\u001a\u0004\bi\u0010Z\"\u0004\bj\u0010\\R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010%\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bs\u0010UR$\u0010&\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010g\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010'\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010I\u001a\u0004\bz\u0010K\"\u0004\b{\u0010MR\u0018\u0010(\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b|\u0010lR\u0018\u0010)\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010lR\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b~\u0010ER\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010ER\u0018\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010rR\u0019\u00100\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010ER\u0019\u00101\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010ER\u0018\u00102\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010ER.\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0085\u0001\u0010r\u001a\u0005\bX\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u00105\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010ER\u0019\u00106\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010ER'\u00107\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010E\u001a\u0005\b\u008c\u0001\u0010Z\"\u0005\b\u008d\u0001\u0010\\R'\u00108\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010E\u001a\u0005\b\u008e\u0001\u0010Z\"\u0005\b\u008f\u0001\u0010\\R'\u00109\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010E\u001a\u0005\b\u0091\u0001\u0010Z\"\u0005\b\u0092\u0001\u0010\\R'\u0010:\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010E\u001a\u0005\b\u0080\u0001\u0010Z\"\u0005\b\u0094\u0001\u0010\\R&\u0010;\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u0095\u0001\u0010E\u001a\u0004\bq\u0010Z\"\u0005\b\u0096\u0001\u0010\\R)\u0010<\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\bk\u0010\u0099\u0001\"\u0006\b\u0090\u0001\u0010\u009a\u0001R\u0019\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010IR\u0019\u0010>\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010IR\u001f\u0010?\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010rR&\u0010@\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u009e\u0001\u0010U\u001a\u0005\b\u009f\u0001\u0010W\"\u0006\b \u0001\u0010¡\u0001¨\u0006£\u0001"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e;", "Landroid/os/Parcelable;", "<init>", "()V", "course", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "seen0", "seen1", "", "courseId", "courseName", "description", "", "openStreetMap", "matchedToSegments", "userProfilePk", "userGroupPk", "rulePK", "firstName", "lastName", "displayName", "geoRoutePk", "", "sourceTypeId", "sourcePk", "", "distanceMeter", "elevationGainMeter", "elevationLossMeter", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "startPoint", "", "geoPoints", "activityTypePk", "virtualPartnerId", "includeLaps", "elapsedSeconds", "speedMeterPerSecond", "createDate", "updateDate", "isFavorite", "", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoints", "coordinateSystem", "targetCoordinateSystem", "originalCoordinateSystem", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "courseLines", "consumer", "applicationName", "companyName", "companyWebsite", "imageURL", "startNote", "finishNote", "cutoffDuration", "hasTurnDetectionDisabled", "hasShareableEvent", "intervalMarkers", "httpResponseCode", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;Ljava/util/List;ILjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;ILm63/u1;)V", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/lang/Boolean;", "getOpenStreetMap", "()Ljava/lang/Boolean;", "setOpenStreetMap", "(Ljava/lang/Boolean;)V", JWKParameterNames.RSA_EXPONENT, "getMatchedToSegments", "setMatchedToSegments", "f", "g", "value", "h", "I", "getRulePK", "()I", IntegerTokenConverter.CONVERTER_KEY, "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "j", "getLastName", "setLastName", JWKParameterNames.OCT_KEY_VALUE, "getDisplayName", "setDisplayName", "l", "u", "setGeoRoutePk", "m", "Ljava/lang/Long;", JWKParameterNames.RSA_MODULUS, "getSourcePk", "A0", "o", "Ljava/lang/Double;", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ljava/util/List;", "v", "w", "getVirtualPartnerId", "()Ljava/lang/Long;", "setVirtualPartnerId", "(Ljava/lang/Long;)V", "x", "getIncludeLaps", "setIncludeLaps", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "A", "B", "C", "Z", "D", "E", "F", "P", "()Ljava/util/List;", "h0", "(Ljava/util/List;)V", "T", "X", "Y", "getCompanyName", "setCompanyName", "getCompanyWebsite", "setCompanyWebsite", "k0", "getImageURL", "setImageURL", "H0", "E0", "I0", "q0", "J0", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "K0", "L0", "M0", "N0", "getHttpResponseCode", "setHttpResponseCode", "(I)V", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final l<i63.c<Object>>[] O0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("createDate")
    public String createDate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("updateDate")
    public String updateDate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("favorite")
    public boolean isFavorite;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("coursePoints")
    private List<g> coursePoints;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("coordinateSystem")
    private String coordinateSystem;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("targetCoordinateSystem")
    private String targetCoordinateSystem;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("startNote")
    private String startNote;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("originalCoordinateSystem")
    private String originalCoordinateSystem;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("finishNote")
    private String finishNote;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("cutoffDuration")
    private Integer cutoffDuration;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("hasTurnDetectionDisabled")
    private Boolean hasTurnDetectionDisabled;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("hasShareableEvent")
    private Boolean hasShareableEvent;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    public List<g> intervalMarkers;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int httpResponseCode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("courseLines")
    private List<CourseSegmentDTO> courseLines;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("consumer")
    public String consumer;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("applicationName")
    public String applicationName;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("companyName")
    private String companyName;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("companyWebsite")
    private String companyWebsite;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    public String courseId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    public String courseName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    public String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("openStreetMap")
    private Boolean openStreetMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("matchedToSegments")
    private Boolean matchedToSegments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    public String userProfilePk;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGroupPk")
    public String userGroupPk;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rulePK")
    private int rulePK;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private String firstName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private String lastName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageURL")
    private String imageURL;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("geoRoutePk")
    private String geoRoutePk;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourceTypeId")
    public Long sourceTypeId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourcePk")
    private String sourcePk;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceMeter")
    private Double distanceMeter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGainMeter")
    private Double elevationGainMeter;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLossMeter")
    private Double elevationLossMeter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startPoint")
    private GeoPointDTO startPoint;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("geoPoints")
    public List<GeoPointDTO> geoPoints;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypePk")
    public int activityTypePk;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("virtualPartnerId")
    private Long virtualPartnerId;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeLaps")
    private Boolean includeLaps;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elapsedSeconds")
    public Double elapsedSeconds;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedMeterPerSecond")
    private Double speedMeterPerSecond;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/e$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/e$d", "Lcom/google/gson/reflect/TypeToken;", "", "", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends TypeToken<List<? extends String>> {
    }

    static {
        n nVar = n.PUBLICATION;
        O0 = new l[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, m.a(nVar, new k01.a(21)), null, null, null, null, null, null, null, null, m.a(nVar, new k01.a(22)), null, null, null, m.a(nVar, new k01.a(23)), null, null, null, null, null, null, null, null, null, null, m.a(nVar, new k01.a(24)), null};
        CREATOR = new b();
    }

    public e(int i14, int i15, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, int i16, String str6, String str7, String str8, String str9, Long l14, String str10, Double d14, Double d15, Double d16, GeoPointDTO geoPointDTO, List list, int i17, Long l15, Boolean bool3, Double d17, Double d18, String str11, String str12, boolean z14, List list2, String str13, String str14, String str15, List list3, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num, Boolean bool4, Boolean bool5, List list4, int i18, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.courseId = null;
        } else {
            this.courseId = str;
        }
        if ((i14 & 2) == 0) {
            this.courseName = null;
        } else {
            this.courseName = str2;
        }
        if ((i14 & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i14 & 8) == 0) {
            this.openStreetMap = Boolean.FALSE;
        } else {
            this.openStreetMap = bool;
        }
        if ((i14 & 16) == 0) {
            this.matchedToSegments = null;
        } else {
            this.matchedToSegments = bool2;
        }
        if ((i14 & 32) == 0) {
            this.userProfilePk = null;
        } else {
            this.userProfilePk = str4;
        }
        if ((i14 & 64) == 0) {
            this.userGroupPk = null;
        } else {
            this.userGroupPk = str5;
        }
        if ((i14 & 128) == 0) {
            this.rulePK = 0;
        } else {
            this.rulePK = i16;
        }
        if ((i14 & 256) == 0) {
            this.firstName = null;
        } else {
            this.firstName = str6;
        }
        if ((i14 & 512) == 0) {
            this.lastName = null;
        } else {
            this.lastName = str7;
        }
        if ((i14 & 1024) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str8;
        }
        if ((i14 & 2048) == 0) {
            this.geoRoutePk = null;
        } else {
            this.geoRoutePk = str9;
        }
        if ((i14 & 4096) == 0) {
            this.sourceTypeId = null;
        } else {
            this.sourceTypeId = l14;
        }
        if ((i14 & 8192) == 0) {
            this.sourcePk = null;
        } else {
            this.sourcePk = str10;
        }
        if ((i14 & 16384) == 0) {
            this.distanceMeter = null;
        } else {
            this.distanceMeter = d14;
        }
        if ((32768 & i14) == 0) {
            this.elevationGainMeter = null;
        } else {
            this.elevationGainMeter = d15;
        }
        if ((65536 & i14) == 0) {
            this.elevationLossMeter = null;
        } else {
            this.elevationLossMeter = d16;
        }
        if ((131072 & i14) == 0) {
            this.startPoint = null;
        } else {
            this.startPoint = geoPointDTO;
        }
        this.geoPoints = (262144 & i14) == 0 ? j0.f134944a : list;
        if ((524288 & i14) == 0) {
            this.activityTypePk = 0;
        } else {
            this.activityTypePk = i17;
        }
        if ((1048576 & i14) == 0) {
            this.virtualPartnerId = null;
        } else {
            this.virtualPartnerId = l15;
        }
        if ((2097152 & i14) == 0) {
            this.includeLaps = null;
        } else {
            this.includeLaps = bool3;
        }
        if ((4194304 & i14) == 0) {
            this.elapsedSeconds = null;
        } else {
            this.elapsedSeconds = d17;
        }
        if ((8388608 & i14) == 0) {
            this.speedMeterPerSecond = null;
        } else {
            this.speedMeterPerSecond = d18;
        }
        if ((16777216 & i14) == 0) {
            this.createDate = null;
        } else {
            this.createDate = str11;
        }
        if ((33554432 & i14) == 0) {
            this.updateDate = null;
        } else {
            this.updateDate = str12;
        }
        if ((67108864 & i14) == 0) {
            this.isFavorite = false;
        } else {
            this.isFavorite = z14;
        }
        if ((134217728 & i14) == 0) {
            this.coursePoints = null;
        } else {
            this.coursePoints = list2;
        }
        if ((268435456 & i14) == 0) {
            this.coordinateSystem = null;
        } else {
            this.coordinateSystem = str13;
        }
        if ((536870912 & i14) == 0) {
            this.targetCoordinateSystem = null;
        } else {
            this.targetCoordinateSystem = str14;
        }
        if ((1073741824 & i14) == 0) {
            this.originalCoordinateSystem = null;
        } else {
            this.originalCoordinateSystem = str15;
        }
        if ((i14 & Integer.MIN_VALUE) == 0) {
            this.courseLines = null;
        } else {
            this.courseLines = list3;
        }
        if ((i15 & 1) == 0) {
            this.consumer = null;
        } else {
            this.consumer = str16;
        }
        if ((i15 & 2) == 0) {
            this.applicationName = null;
        } else {
            this.applicationName = str17;
        }
        if ((i15 & 4) == 0) {
            this.companyName = null;
        } else {
            this.companyName = str18;
        }
        if ((i15 & 8) == 0) {
            this.companyWebsite = null;
        } else {
            this.companyWebsite = str19;
        }
        if ((i15 & 16) == 0) {
            this.imageURL = null;
        } else {
            this.imageURL = str20;
        }
        if ((i15 & 32) == 0) {
            this.startNote = null;
        } else {
            this.startNote = str21;
        }
        if ((i15 & 64) == 0) {
            this.finishNote = null;
        } else {
            this.finishNote = str22;
        }
        if ((i15 & 128) == 0) {
            this.cutoffDuration = null;
        } else {
            this.cutoffDuration = num;
        }
        if ((i15 & 256) == 0) {
            this.hasTurnDetectionDisabled = null;
        } else {
            this.hasTurnDetectionDisabled = bool4;
        }
        if ((i15 & 512) == 0) {
            this.hasShareableEvent = null;
        } else {
            this.hasShareableEvent = bool5;
        }
        if ((i15 & 1024) == 0) {
            this.intervalMarkers = null;
        } else {
            this.intervalMarkers = list4;
        }
        if ((i15 & 2048) == 0) {
            this.httpResponseCode = 0;
        } else {
            this.httpResponseCode = i18;
        }
    }

    public static final void M0(e eVar, l63.d dVar, k63.e eVar2) {
        if (dVar.C(eVar2) || eVar.courseId != null) {
            dVar.d(eVar2, 0, y1.f117048a, eVar.courseId);
        }
        if (dVar.C(eVar2) || eVar.courseName != null) {
            dVar.d(eVar2, 1, y1.f117048a, eVar.courseName);
        }
        if (dVar.C(eVar2) || eVar.description != null) {
            dVar.d(eVar2, 2, y1.f117048a, eVar.description);
        }
        if (dVar.C(eVar2) || !s.g(eVar.openStreetMap, Boolean.FALSE)) {
            dVar.d(eVar2, 3, m63.g.f116948a, eVar.openStreetMap);
        }
        if (dVar.C(eVar2) || eVar.matchedToSegments != null) {
            dVar.d(eVar2, 4, m63.g.f116948a, eVar.matchedToSegments);
        }
        if (dVar.C(eVar2) || eVar.userProfilePk != null) {
            dVar.d(eVar2, 5, y1.f117048a, eVar.userProfilePk);
        }
        if (dVar.C(eVar2) || eVar.userGroupPk != null) {
            dVar.d(eVar2, 6, y1.f117048a, eVar.userGroupPk);
        }
        if (dVar.C(eVar2) || eVar.rulePK != 0) {
            dVar.v(7, eVar.rulePK, eVar2);
        }
        if (dVar.C(eVar2) || eVar.firstName != null) {
            dVar.d(eVar2, 8, y1.f117048a, eVar.firstName);
        }
        if (dVar.C(eVar2) || eVar.lastName != null) {
            dVar.d(eVar2, 9, y1.f117048a, eVar.lastName);
        }
        if (dVar.C(eVar2) || eVar.displayName != null) {
            dVar.d(eVar2, 10, y1.f117048a, eVar.displayName);
        }
        if (dVar.C(eVar2) || eVar.geoRoutePk != null) {
            dVar.d(eVar2, 11, y1.f117048a, eVar.geoRoutePk);
        }
        if (dVar.C(eVar2) || eVar.sourceTypeId != null) {
            dVar.d(eVar2, 12, v0.f117027a, eVar.sourceTypeId);
        }
        if (dVar.C(eVar2) || eVar.sourcePk != null) {
            dVar.d(eVar2, 13, y1.f117048a, eVar.sourcePk);
        }
        if (dVar.C(eVar2) || eVar.distanceMeter != null) {
            dVar.d(eVar2, 14, x.f117036a, eVar.distanceMeter);
        }
        if (dVar.C(eVar2) || eVar.elevationGainMeter != null) {
            dVar.d(eVar2, 15, x.f117036a, eVar.elevationGainMeter);
        }
        if (dVar.C(eVar2) || eVar.elevationLossMeter != null) {
            dVar.d(eVar2, 16, x.f117036a, eVar.elevationLossMeter);
        }
        if (dVar.C(eVar2) || eVar.startPoint != null) {
            dVar.d(eVar2, 17, GeoPointDTO.a.f32808a, eVar.startPoint);
        }
        boolean zC = dVar.C(eVar2);
        l<i63.c<Object>>[] lVarArr = O0;
        if (zC || !s.g(eVar.geoPoints, j0.f134944a)) {
            dVar.d(eVar2, 18, lVarArr[18].getValue(), eVar.geoPoints);
        }
        if (dVar.C(eVar2) || eVar.activityTypePk != 0) {
            dVar.v(19, eVar.activityTypePk, eVar2);
        }
        if (dVar.C(eVar2) || eVar.virtualPartnerId != null) {
            dVar.d(eVar2, 20, v0.f117027a, eVar.virtualPartnerId);
        }
        if (dVar.C(eVar2) || eVar.includeLaps != null) {
            dVar.d(eVar2, 21, m63.g.f116948a, eVar.includeLaps);
        }
        if (dVar.C(eVar2) || eVar.elapsedSeconds != null) {
            dVar.d(eVar2, 22, x.f117036a, eVar.elapsedSeconds);
        }
        if (dVar.C(eVar2) || eVar.speedMeterPerSecond != null) {
            dVar.d(eVar2, 23, x.f117036a, eVar.speedMeterPerSecond);
        }
        if (dVar.C(eVar2) || eVar.createDate != null) {
            dVar.d(eVar2, 24, y1.f117048a, eVar.createDate);
        }
        if (dVar.C(eVar2) || eVar.updateDate != null) {
            dVar.d(eVar2, 25, y1.f117048a, eVar.updateDate);
        }
        if (dVar.C(eVar2) || eVar.isFavorite) {
            dVar.n(eVar2, 26, eVar.isFavorite);
        }
        if (dVar.C(eVar2) || eVar.coursePoints != null) {
            dVar.d(eVar2, 27, lVarArr[27].getValue(), eVar.coursePoints);
        }
        if (dVar.C(eVar2) || eVar.coordinateSystem != null) {
            dVar.d(eVar2, 28, y1.f117048a, eVar.coordinateSystem);
        }
        if (dVar.C(eVar2) || eVar.targetCoordinateSystem != null) {
            dVar.d(eVar2, 29, y1.f117048a, eVar.targetCoordinateSystem);
        }
        if (dVar.C(eVar2) || eVar.originalCoordinateSystem != null) {
            dVar.d(eVar2, 30, y1.f117048a, eVar.originalCoordinateSystem);
        }
        if (dVar.C(eVar2) || eVar.courseLines != null) {
            dVar.d(eVar2, 31, lVarArr[31].getValue(), eVar.courseLines);
        }
        if (dVar.C(eVar2) || eVar.consumer != null) {
            dVar.d(eVar2, 32, y1.f117048a, eVar.consumer);
        }
        if (dVar.C(eVar2) || eVar.applicationName != null) {
            dVar.d(eVar2, 33, y1.f117048a, eVar.applicationName);
        }
        if (dVar.C(eVar2) || eVar.companyName != null) {
            dVar.d(eVar2, 34, y1.f117048a, eVar.companyName);
        }
        if (dVar.C(eVar2) || eVar.companyWebsite != null) {
            dVar.d(eVar2, 35, y1.f117048a, eVar.companyWebsite);
        }
        if (dVar.C(eVar2) || eVar.imageURL != null) {
            dVar.d(eVar2, 36, y1.f117048a, eVar.imageURL);
        }
        if (dVar.C(eVar2) || eVar.startNote != null) {
            dVar.d(eVar2, 37, y1.f117048a, eVar.startNote);
        }
        if (dVar.C(eVar2) || eVar.finishNote != null) {
            dVar.d(eVar2, 38, y1.f117048a, eVar.finishNote);
        }
        if (dVar.C(eVar2) || eVar.cutoffDuration != null) {
            dVar.d(eVar2, 39, m0.f116981a, eVar.cutoffDuration);
        }
        if (dVar.C(eVar2) || eVar.hasTurnDetectionDisabled != null) {
            dVar.d(eVar2, 40, m63.g.f116948a, eVar.hasTurnDetectionDisabled);
        }
        if (dVar.C(eVar2) || eVar.hasShareableEvent != null) {
            dVar.d(eVar2, 41, m63.g.f116948a, eVar.hasShareableEvent);
        }
        if (dVar.C(eVar2) || eVar.intervalMarkers != null) {
            dVar.d(eVar2, 42, lVarArr[42].getValue(), eVar.intervalMarkers);
        }
        if (!dVar.C(eVar2) && eVar.httpResponseCode == 0) {
            return;
        }
        dVar.v(43, eVar.httpResponseCode, eVar2);
    }

    public static boolean a0() {
        List list = (List) new Gson().fromJson(((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).e("lap_by_course_point_feature_enabled"), new d().getType());
        if (list == null) {
            return false;
        }
        if (list.contains("AnyUser")) {
            return true;
        }
        if (list.contains("MBTester")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                return true;
            }
        }
        if (!list.contains("DITester")) {
            return false;
        }
        s3.f23252a.getClass();
        return s3.a("ROLE_DI_TESTER");
    }

    public final double A() {
        Double d14 = this.speedMeterPerSecond;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public final void A0(String str) {
        this.sourcePk = str;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getStartNote() {
        return this.startNote;
    }

    public final void C0(Double d14) {
        this.speedMeterPerSecond = d14;
    }

    public final GeoPointDTO D() {
        List<GeoPointDTO> list = this.geoPoints;
        if (list == null || list.isEmpty()) {
            return this.startPoint;
        }
        List<GeoPointDTO> list2 = this.geoPoints;
        if (list2 != null) {
            return list2.get(0);
        }
        return null;
    }

    public final void E0(String str) {
        this.startNote = str;
    }

    public final com.garmin.android.library.mapsdkadapter.i.b F() {
        com.garmin.android.library.mapsdkadapter.i.b bVarValueOf;
        try {
            String str = this.targetCoordinateSystem;
            if (str != null && (bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(str)) != null) {
                return bVarValueOf;
            }
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.p(a2Var, "CourseDetailDTO", "Coordinate System not available, default: WGS-84");
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
    }

    public final boolean G() {
        List<g> list;
        if (!a0() || (list = this.coursePoints) == null || list.isEmpty()) {
            return false;
        }
        for (g gVar : list) {
            if (s.g(gVar.getCoursePointType(), f.MARKER_MILE.f32922a) || s.g(gVar.getCoursePointType(), f.MARKER_KILOMETER.f32922a) || s.g(gVar.getCoursePointType(), f.MARKER_HALF_MARATHON.f32922a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Boolean getHasShareableEvent() {
        return this.hasShareableEvent;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getHasTurnDetectionDisabled() {
        return this.hasTurnDetectionDisabled;
    }

    public final void J0(GeoPointDTO geoPointDTO) {
        this.startPoint = geoPointDTO;
    }

    public final void L0(com.garmin.android.library.mapsdkadapter.i.b bVar) {
        bVar.getClass();
        this.targetCoordinateSystem = bVar.name();
    }

    public final boolean M() {
        Double d14 = this.distanceMeter;
        return (d14 != null ? d14.doubleValue() : 0.0d) > 241402.0d;
    }

    public final boolean Z() {
        Long l14 = this.sourceTypeId;
        return l14 != null && l14.longValue() == 4;
    }

    public final void b(g gVar) {
        if (gVar != null) {
            if (this.coursePoints == null) {
                this.coursePoints = new ArrayList();
            }
            List<g> list = this.coursePoints;
            if (list != null) {
                list.add(gVar);
            }
        }
    }

    public final boolean c0() {
        String str = this.userProfilePk;
        return str != null && Long.parseLong(str) == ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
    }

    public final void d(g gVar) {
        List<g> list;
        if (gVar == null || (list = this.coursePoints) == null) {
            return;
        }
        list.removeIf(new a73.n(new c60.c(gVar, 1), 11));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e0() {
        return this.rulePK == 1;
    }

    public final void f(g gVar) {
        List<g> list = this.coursePoints;
        if (list != null) {
            y0.a(list).remove(gVar);
        }
    }

    public final boolean f0() {
        return !TextUtils.isEmpty(this.consumer);
    }

    public final x0 g() {
        return z0.k(this.activityTypePk, x0.f4346x);
    }

    public final void g0(com.garmin.android.library.mapsdkadapter.i.b bVar) {
        bVar.getClass();
        this.coordinateSystem = bVar.name();
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final com.garmin.android.library.mapsdkadapter.i.b h() {
        com.garmin.android.library.mapsdkadapter.i.b bVarValueOf;
        try {
            String str = this.coordinateSystem;
            if (str != null && (bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(str)) != null) {
                return bVarValueOf;
            }
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.p(a2Var, "CourseDetailDTO", "Coordinate System not available, default: WGS-84");
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
    }

    public final void h0(List<CourseSegmentDTO> list) {
        this.courseLines = list;
    }

    public final List<CourseSegmentDTO> i() {
        return this.courseLines;
    }

    public final void i0(ArrayList arrayList) {
        this.coursePoints = arrayList;
    }

    public final List<g> j() {
        if (this.coursePoints == null) {
            this.coursePoints = new ArrayList();
        }
        fy1.i.f73924a.getClass();
        if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).s() || a0()) {
            return this.coursePoints;
        }
        List<g> list = this.coursePoints;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g gVar = (g) obj;
            if (!s.g(gVar.getCoursePointType(), f.MARKER_MILE.f32922a) && !s.g(gVar.getCoursePointType(), f.MARKER_KILOMETER.f32922a) && !s.g(gVar.getCoursePointType(), f.MARKER_HALF_MARATHON.f32922a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void j0(i iVar) {
        iVar.getClass();
        this.activityTypePk = ((am.y0) KoinJavaComponent.get$default(am.y0.class, null, null, 6, null)).c(iVar.f32984f);
    }

    public final ArrayList k() {
        if (this.coursePoints == null) {
            this.coursePoints = new ArrayList();
        }
        List<g> list = this.coursePoints;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g gVar = (g) obj;
            if (!s.g(gVar.getCoursePointType(), f.MARKER_MILE.f32922a) && !s.g(gVar.getCoursePointType(), f.MARKER_KILOMETER.f32922a) && !s.g(gVar.getCoursePointType(), f.MARKER_HALF_MARATHON.f32922a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void k0(Integer num) {
        this.cutoffDuration = num;
    }

    public final i m() {
        i.a aVar = i.f32968g;
        x0 x0VarG = g();
        aVar.getClass();
        return i.a.a(x0VarG);
    }

    public final void n0(Double d14) {
        this.distanceMeter = d14;
        double dQ = q();
        if (Double.isNaN(dQ)) {
            this.elapsedSeconds = null;
            this.speedMeterPerSecond = null;
            return;
        }
        double dA = A();
        if (Double.isNaN(dA)) {
            this.elapsedSeconds = null;
        } else {
            this.elapsedSeconds = Double.valueOf(dQ / dA);
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getCutoffDuration() {
        return this.cutoffDuration;
    }

    public final void o0(Double d14) {
        this.elevationGainMeter = d14;
    }

    public final void p0(Double d14) {
        this.elevationLossMeter = d14;
    }

    public final double q() {
        Double d14 = this.distanceMeter;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public final void q0(String str) {
        this.finishNote = str;
    }

    public final double r() {
        Double d14 = this.elevationGainMeter;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    public final double s() {
        Double d14 = this.elevationLossMeter;
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getFinishNote() {
        return this.finishNote;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getGeoRoutePk() {
        return this.geoRoutePk;
    }

    public final void w0(Boolean bool) {
        this.hasTurnDetectionDisabled = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int i15;
        int i16;
        int i17;
        parcel.getClass();
        parcel.writeString(this.courseId);
        parcel.writeString(this.courseName);
        parcel.writeString(this.description);
        Boolean bool = this.openStreetMap;
        int i18 = 2;
        if (bool == null) {
            i15 = 0;
        } else {
            i15 = s.g(bool, Boolean.TRUE) ? 1 : 2;
        }
        parcel.writeByte((byte) i15);
        Boolean bool2 = this.matchedToSegments;
        if (bool2 == null) {
            i16 = 0;
        } else {
            i16 = s.g(bool2, Boolean.TRUE) ? 1 : 2;
        }
        parcel.writeByte((byte) i16);
        parcel.writeString(this.userProfilePk);
        parcel.writeString(this.userGroupPk);
        parcel.writeInt(this.rulePK);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.geoRoutePk);
        if (this.sourceTypeId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Long l14 = this.sourceTypeId;
            l14.getClass();
            parcel.writeLong(l14.longValue());
        }
        parcel.writeString(this.sourcePk);
        if (this.distanceMeter == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d14 = this.distanceMeter;
            d14.getClass();
            parcel.writeDouble(d14.doubleValue());
        }
        if (this.elevationGainMeter == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d15 = this.elevationGainMeter;
            d15.getClass();
            parcel.writeDouble(d15.doubleValue());
        }
        if (this.elevationLossMeter == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d16 = this.elevationLossMeter;
            d16.getClass();
            parcel.writeDouble(d16.doubleValue());
        }
        parcel.writeParcelable(this.startPoint, i14);
        parcel.writeTypedList(this.geoPoints);
        parcel.writeInt(this.activityTypePk);
        if (this.virtualPartnerId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Long l15 = this.virtualPartnerId;
            l15.getClass();
            parcel.writeLong(l15.longValue());
        }
        Boolean bool3 = this.includeLaps;
        if (bool3 == null) {
            i17 = 0;
        } else {
            i17 = s.g(bool3, Boolean.TRUE) ? 1 : 2;
        }
        parcel.writeByte((byte) i17);
        if (this.elapsedSeconds == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d17 = this.elapsedSeconds;
            d17.getClass();
            parcel.writeDouble(d17.doubleValue());
        }
        if (this.speedMeterPerSecond == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Double d18 = this.speedMeterPerSecond;
            d18.getClass();
            parcel.writeDouble(d18.doubleValue());
        }
        parcel.writeString(this.createDate);
        parcel.writeString(this.updateDate);
        parcel.writeTypedList(this.coursePoints);
        parcel.writeString(this.coordinateSystem);
        parcel.writeString(this.targetCoordinateSystem);
        parcel.writeString(this.originalCoordinateSystem);
        parcel.writeTypedList(this.courseLines);
        parcel.writeTypedList(this.intervalMarkers);
        parcel.writeInt(this.httpResponseCode);
        parcel.writeString(this.consumer);
        parcel.writeString(this.applicationName);
        parcel.writeString(this.companyName);
        parcel.writeString(this.companyWebsite);
        parcel.writeString(this.imageURL);
        parcel.writeString(this.startNote);
        parcel.writeString(this.finishNote);
        if (this.cutoffDuration == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Integer num = this.cutoffDuration;
            parcel.writeInt(num != null ? num.intValue() : 0);
        }
        if (this.hasTurnDetectionDisabled == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByte(s.g(this.hasTurnDetectionDisabled, Boolean.TRUE) ? (byte) 1 : (byte) 0);
        }
        Boolean bool4 = this.hasShareableEvent;
        if (bool4 == null) {
            i18 = 0;
        } else if (s.g(bool4, Boolean.TRUE)) {
            i18 = 1;
        }
        parcel.writeByte((byte) i18);
    }

    public final void x0(com.garmin.android.library.mapsdkadapter.i.b bVar) {
        bVar.getClass();
        this.originalCoordinateSystem = bVar.name();
    }

    public final com.garmin.android.library.mapsdkadapter.i.b y() {
        try {
            String str = this.coordinateSystem;
            if (str != null) {
                return com.garmin.android.library.mapsdkadapter.i.b.valueOf(str);
            }
            return null;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.p(a2Var, "CourseDetailDTO", "Coordinate System not available, default: WGS-84");
            return null;
        }
    }

    public final com.garmin.android.library.mapsdkadapter.i.b z() {
        com.garmin.android.library.mapsdkadapter.i.b bVarValueOf;
        try {
            String str = this.originalCoordinateSystem;
            if (str != null && (bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(str)) != null) {
                return bVarValueOf;
            }
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar.getClass();
            i2.a.p(a2Var, "CourseDetailDTO", "Coordinate System not available, default: WGS-84");
            return com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
    }

    public final void z0(boolean z14) {
        this.rulePK = z14 ? 1 : 2;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.e$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/e$c;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "serializer", "()Li63/c;", "", "TAG", "Ljava/lang/String;", "", "COURSE_PUBLIC_TYPE_ID", "I", "COURSE_PRIVATE_TYPE_ID", "", "SOURCE_TYPE_ID_ACTIVITY", "J", "SOURCE_TYPE_ID_COURSE", "SOURCE_TYPE_ID_CREATOR", "", "MAX_LAP_BY_COURSE_POINT_DISTANCE", "D", "SOURCE_TYPE_ID_TRAILS", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f32890a;
        }

        private Companion() {
        }
    }

    public e() {
        this.openStreetMap = Boolean.FALSE;
        this.geoPoints = j0.f134944a;
        this.coursePoints = new ArrayList();
    }

    public e(e eVar) {
        ArrayList arrayList;
        eVar.getClass();
        this.openStreetMap = Boolean.FALSE;
        this.geoPoints = j0.f134944a;
        this.courseId = eVar.courseId;
        this.courseName = eVar.courseName;
        this.description = eVar.description;
        this.openStreetMap = eVar.openStreetMap;
        this.matchedToSegments = eVar.matchedToSegments;
        this.userProfilePk = eVar.userProfilePk;
        this.userGroupPk = eVar.userGroupPk;
        this.rulePK = eVar.rulePK;
        this.firstName = eVar.firstName;
        this.lastName = eVar.lastName;
        this.displayName = eVar.displayName;
        this.geoRoutePk = eVar.geoRoutePk;
        this.sourceTypeId = eVar.sourceTypeId;
        this.sourcePk = eVar.sourcePk;
        this.distanceMeter = eVar.distanceMeter;
        this.elevationGainMeter = eVar.elevationGainMeter;
        this.elevationLossMeter = eVar.elevationLossMeter;
        this.startPoint = eVar.D();
        this.geoPoints = eVar.geoPoints;
        this.activityTypePk = eVar.activityTypePk;
        this.virtualPartnerId = eVar.virtualPartnerId;
        this.includeLaps = eVar.includeLaps;
        this.elapsedSeconds = eVar.elapsedSeconds;
        this.speedMeterPerSecond = eVar.speedMeterPerSecond;
        this.createDate = eVar.createDate;
        this.updateDate = eVar.updateDate;
        this.isFavorite = eVar.isFavorite;
        if (eVar.j() != null) {
            List<g> listJ = eVar.j();
            if (listJ != null) {
                ArrayList arrayList2 = new ArrayList(y.r(listJ, 10));
                Iterator<T> it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new g((g) it.next()));
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            this.coursePoints = arrayList;
        } else {
            this.coursePoints = new ArrayList();
        }
        this.intervalMarkers = eVar.intervalMarkers;
        this.coordinateSystem = eVar.h().name();
        com.garmin.android.library.mapsdkadapter.i.b bVarF = eVar.F();
        this.targetCoordinateSystem = bVarF != null ? bVarF.name() : null;
        this.originalCoordinateSystem = eVar.z().name();
        this.courseLines = eVar.courseLines;
        this.hasTurnDetectionDisabled = eVar.hasTurnDetectionDisabled;
        this.consumer = eVar.consumer;
        this.applicationName = eVar.applicationName;
        this.companyName = eVar.companyName;
        this.companyWebsite = eVar.companyWebsite;
        this.imageURL = eVar.imageURL;
        this.startNote = eVar.startNote;
        this.finishNote = eVar.finishNote;
        this.cutoffDuration = eVar.cutoffDuration;
        this.hasShareableEvent = eVar.hasShareableEvent;
    }

    public e(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        parcel.getClass();
        this.openStreetMap = Boolean.FALSE;
        this.geoPoints = j0.f134944a;
        this.courseId = parcel.readString();
        this.courseName = parcel.readString();
        this.description = parcel.readString();
        byte b14 = parcel.readByte();
        Boolean boolValueOf5 = null;
        if (b14 == 0) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(b14 == 1);
        }
        this.openStreetMap = boolValueOf;
        byte b15 = parcel.readByte();
        if (b15 == 0) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(b15 == 1);
        }
        this.matchedToSegments = boolValueOf2;
        this.userProfilePk = parcel.readString();
        this.userGroupPk = parcel.readString();
        this.rulePK = parcel.readInt();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.displayName = parcel.readString();
        this.geoRoutePk = parcel.readString();
        this.sourceTypeId = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.sourcePk = parcel.readString();
        this.distanceMeter = parcel.readByte() == 0 ? null : Double.valueOf(parcel.readDouble());
        this.elevationGainMeter = parcel.readByte() == 0 ? null : Double.valueOf(parcel.readDouble());
        this.elevationLossMeter = parcel.readByte() == 0 ? null : Double.valueOf(parcel.readDouble());
        this.startPoint = (GeoPointDTO) parcel.readParcelable(GeoPointDTO.class.getClassLoader());
        this.geoPoints = parcel.createTypedArrayList(GeoPointDTO.CREATOR);
        this.activityTypePk = parcel.readInt();
        this.virtualPartnerId = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        byte b16 = parcel.readByte();
        if (b16 == 0) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(b16 == 1);
        }
        this.includeLaps = boolValueOf3;
        this.elapsedSeconds = parcel.readByte() == 0 ? null : Double.valueOf(parcel.readDouble());
        this.speedMeterPerSecond = parcel.readByte() == 0 ? null : Double.valueOf(parcel.readDouble());
        this.createDate = parcel.readString();
        this.updateDate = parcel.readString();
        Parcelable.Creator<g> creator = g.CREATOR;
        this.coursePoints = parcel.createTypedArrayList(creator);
        this.coordinateSystem = parcel.readString();
        this.targetCoordinateSystem = parcel.readString();
        this.originalCoordinateSystem = parcel.readString();
        this.courseLines = parcel.createTypedArrayList(CourseSegmentDTO.INSTANCE);
        this.intervalMarkers = parcel.createTypedArrayList(creator);
        this.httpResponseCode = parcel.readInt();
        this.consumer = parcel.readString();
        this.applicationName = parcel.readString();
        this.companyName = parcel.readString();
        this.companyWebsite = parcel.readString();
        this.imageURL = parcel.readString();
        this.startNote = parcel.readString();
        this.finishNote = parcel.readString();
        this.cutoffDuration = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        if (parcel.readByte() == 0) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(parcel.readByte() != 0);
        }
        this.hasTurnDetectionDisabled = boolValueOf4;
        byte b17 = parcel.readByte();
        if (b17 != 0) {
            boolValueOf5 = Boolean.valueOf(b17 == 1);
        }
        this.hasShareableEvent = boolValueOf5;
    }
}
