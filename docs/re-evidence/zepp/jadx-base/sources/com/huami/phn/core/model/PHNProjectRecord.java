package com.huami.phn.core.model;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.phn.core.source.impl.db.JsonObjectConverter;
import com.huami.phn.core.source.impl.db.PHNProjectSettingConverter;
import com.huami.phn.core.source.impl.db.TimeAndZoneConverter;
import defpackage.b;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@TypeConverters({PHNProjectSettingConverter.class, TimeAndZoneConverter.class, JsonObjectConverter.class})
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0003BACBA\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b;\u0010<BS\b\u0017\u0012\u0006\u0010=\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b;\u0010@J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0013HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0013HÆ\u0001J\t\u0010\u001d\u001a\u00020\rHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R$\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00103\u0012\u0004\b6\u0010&\u001a\u0004\b4\u00105R(\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u00103\u0012\u0004\b:\u0010&\u001a\u0004\b7\u00105\"\u0004\b8\u00109¨\u0006D"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "stateChangeByServer", "stateChangeByApp", "", "component1", "", "component2", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;", "component3", "Lkotlinx/serialization/json/JsonObject;", "component4", "", "component5", "component6", "timestamp", "version", "setting", "result", "source", "synced", "copy", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "getTimestamp$annotations", "()V", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "getVersion$annotations", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;", "getSetting", "()Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;", "getSetting$annotations", "Lkotlinx/serialization/json/JsonObject;", "getResult", "()Lkotlinx/serialization/json/JsonObject;", "getResult$annotations", LogUtil.I, "getSource", "()I", "getSource$annotations", "getSynced", "setSynced", "(I)V", "getSynced$annotations", "<init>", "(JLjava/lang/String;Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;Lkotlinx/serialization/json/JsonObject;II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;Lkotlinx/serialization/json/JsonObject;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "PHNProjectSetting", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
@Serializable
@Entity(tableName = PHNProjectRecord.TABLE_NAME)
public final /* data */ class PHNProjectRecord {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int SYNC_TO_SERVER = 1;

    @NotNull
    public static final String TABLE_NAME = "phn_project";
    public static final int UNSYNCED = 0;

    @Nullable
    private final JsonObject result;

    @NotNull
    private final PHNProjectSetting setting;
    private final int source;
    private int synced;

    @PrimaryKey
    private final long timestamp;

    @NotNull
    private final String version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/phn/core/model/PHNProjectRecord;", "serializer", "", "SYNC_TO_SERVER", LogUtil.I, "", "TABLE_NAME", "Ljava/lang/String;", "UNSYNCED", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PHNProjectRecord> serializer() {
            return PHNProjectRecord$$serializer.INSTANCE;
        }
    }

    @TypeConverters({TimeAndZoneConverter.class})
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0003768B7\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b0\u00101BU\b\u0017\u0012\u0006\u00102\u001a\u00020\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0019\u001a\u00020\f\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\fHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0014HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0014HÖ\u0001R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b'\u0010!\u001a\u0004\b%\u0010&R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010(\u0012\u0004\b+\u0010!\u001a\u0004\b)\u0010*R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b/\u0010!\u001a\u0004\b-\u0010.¨\u00069"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "other", "", "equals", "", "hashCode", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;", "component1", "component2", "", "component3", "component4", "", "component5", "startDate", "endDate", "restDays", "endType", "endReason", "copy", "toString", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;", "getStartDate", "()Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;", "getStartDate$annotations", "()V", "getEndDate", "getEndDate$annotations", "[I", "getRestDays", "()[I", "getRestDays$annotations", LogUtil.I, "getEndType", "()I", "getEndType$annotations", "Ljava/lang/String;", "getEndReason", "()Ljava/lang/String;", "getEndReason$annotations", "<init>", "(Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;[IILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;[IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "TimeStampAndZone", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    @Serializable
    public static final /* data */ class PHNProjectSetting {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final TimeStampAndZone endDate;

        @NotNull
        private final String endReason;
        private final int endType;

        @NotNull
        private final int[] restDays;

        @NotNull
        private final TimeStampAndZone startDate;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;", "serializer", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<PHNProjectSetting> serializer() {
                return PHNProjectRecord$PHNProjectSetting$$serializer.INSTANCE;
            }
        }

        @Keep
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 B/\b\u0017\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "timestamp", "timezone_offset", "copy", "", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "getTimestamp$annotations", "()V", LogUtil.I, "getTimezone_offset", "()I", "getTimezone_offset$annotations", "<init>", "(JI)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        @Serializable
        public static final /* data */ class TimeStampAndZone {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final long timestamp;
            private final int timezone_offset;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;", "serializer", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer<TimeStampAndZone> serializer() {
                    return PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE;
                }
            }

            public TimeStampAndZone() {
                this(0L, 0, 3, (DefaultConstructorMarker) null);
            }

            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ TimeStampAndZone(int i, @SerialName("timestamp") long j, @SerialName("timezone_offset") int i2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i, 0, PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE.getDescriptor());
                }
                this.timestamp = (i & 1) == 0 ? 0L : j;
                if ((i & 2) == 0) {
                    this.timezone_offset = 0;
                } else {
                    this.timezone_offset = i2;
                }
            }

            public static /* synthetic */ TimeStampAndZone copy$default(TimeStampAndZone timeStampAndZone, long j, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = timeStampAndZone.timestamp;
                }
                if ((i2 & 2) != 0) {
                    i = timeStampAndZone.timezone_offset;
                }
                return timeStampAndZone.copy(j, i);
            }

            @SerialName("timestamp")
            public static /* synthetic */ void getTimestamp$annotations() {
            }

            @SerialName("timezone_offset")
            public static /* synthetic */ void getTimezone_offset$annotations() {
            }

            @JvmStatic
            public static final void write$Self(@NotNull TimeStampAndZone self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.timestamp != 0) {
                    output.encodeLongElement(serialDesc, 0, self.timestamp);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.timezone_offset != 0) {
                    output.encodeIntElement(serialDesc, 1, self.timezone_offset);
                }
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getTimezone_offset() {
                return this.timezone_offset;
            }

            @NotNull
            public final TimeStampAndZone copy(long timestamp, int timezone_offset) {
                return new TimeStampAndZone(timestamp, timezone_offset);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimeStampAndZone)) {
                    return false;
                }
                TimeStampAndZone timeStampAndZone = (TimeStampAndZone) other;
                return this.timestamp == timeStampAndZone.timestamp && this.timezone_offset == timeStampAndZone.timezone_offset;
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final int getTimezone_offset() {
                return this.timezone_offset;
            }

            public int hashCode() {
                return (b.a(this.timestamp) * 31) + this.timezone_offset;
            }

            @NotNull
            public String toString() {
                return "TimeStampAndZone(timestamp=" + this.timestamp + ", timezone_offset=" + this.timezone_offset + ")";
            }

            public TimeStampAndZone(long j, int i) {
                this.timestamp = j;
                this.timezone_offset = i;
            }

            public /* synthetic */ TimeStampAndZone(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ PHNProjectSetting(int i, @SerialName(FirebaseAnalytics.Param.START_DATE) TimeStampAndZone timeStampAndZone, @SerialName(FirebaseAnalytics.Param.END_DATE) TimeStampAndZone timeStampAndZone2, @SerialName("rest_days") int[] iArr, @SerialName("end_type") int i2, @SerialName("end_reason") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (5 != (i & 5)) {
                PluginExceptionsKt.throwMissingFieldException(i, 5, PHNProjectRecord$PHNProjectSetting$$serializer.INSTANCE.getDescriptor());
            }
            this.startDate = timeStampAndZone;
            if ((i & 2) == 0) {
                this.endDate = null;
            } else {
                this.endDate = timeStampAndZone2;
            }
            this.restDays = iArr;
            if ((i & 8) == 0) {
                this.endType = 0;
            } else {
                this.endType = i2;
            }
            if ((i & 16) == 0) {
                this.endReason = "";
            } else {
                this.endReason = str;
            }
        }

        public static /* synthetic */ PHNProjectSetting copy$default(PHNProjectSetting pHNProjectSetting, TimeStampAndZone timeStampAndZone, TimeStampAndZone timeStampAndZone2, int[] iArr, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                timeStampAndZone = pHNProjectSetting.startDate;
            }
            if ((i2 & 2) != 0) {
                timeStampAndZone2 = pHNProjectSetting.endDate;
            }
            TimeStampAndZone timeStampAndZone3 = timeStampAndZone2;
            if ((i2 & 4) != 0) {
                iArr = pHNProjectSetting.restDays;
            }
            int[] iArr2 = iArr;
            if ((i2 & 8) != 0) {
                i = pHNProjectSetting.endType;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str = pHNProjectSetting.endReason;
            }
            return pHNProjectSetting.copy(timeStampAndZone, timeStampAndZone3, iArr2, i3, str);
        }

        @SerialName(FirebaseAnalytics.Param.END_DATE)
        public static /* synthetic */ void getEndDate$annotations() {
        }

        @SerialName("end_reason")
        public static /* synthetic */ void getEndReason$annotations() {
        }

        @SerialName("end_type")
        public static /* synthetic */ void getEndType$annotations() {
        }

        @SerialName("rest_days")
        public static /* synthetic */ void getRestDays$annotations() {
        }

        @SerialName(FirebaseAnalytics.Param.START_DATE)
        public static /* synthetic */ void getStartDate$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull PHNProjectSetting self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
            PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer = PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 0, pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer, self.startDate);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.endDate != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer, self.endDate);
            }
            output.encodeSerializableElement(serialDesc, 2, IntArraySerializer.INSTANCE, self.restDays);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.endType != 0) {
                output.encodeIntElement(serialDesc, 3, self.endType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.endReason, "")) {
                output.encodeStringElement(serialDesc, 4, self.endReason);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TimeStampAndZone getStartDate() {
            return this.startDate;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TimeStampAndZone getEndDate() {
            return this.endDate;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int[] getRestDays() {
            return this.restDays;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getEndType() {
            return this.endType;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEndReason() {
            return this.endReason;
        }

        @NotNull
        public final PHNProjectSetting copy(@NotNull TimeStampAndZone startDate, @Nullable TimeStampAndZone endDate, @NotNull int[] restDays, int endType, @NotNull String endReason) {
            return new PHNProjectSetting(startDate, endDate, restDays, endType, endReason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(PHNProjectSetting.class, other == null ? null : other.getClass())) {
                return false;
            }
            Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.phn.core.model.PHNProjectRecord.PHNProjectSetting");
            PHNProjectSetting pHNProjectSetting = (PHNProjectSetting) other;
            return Intrinsics.areEqual(this.startDate, pHNProjectSetting.startDate) && Intrinsics.areEqual(this.endDate, pHNProjectSetting.endDate) && Arrays.equals(this.restDays, pHNProjectSetting.restDays);
        }

        @Nullable
        public final TimeStampAndZone getEndDate() {
            return this.endDate;
        }

        @NotNull
        public final String getEndReason() {
            return this.endReason;
        }

        public final int getEndType() {
            return this.endType;
        }

        @NotNull
        public final int[] getRestDays() {
            return this.restDays;
        }

        @NotNull
        public final TimeStampAndZone getStartDate() {
            return this.startDate;
        }

        public int hashCode() {
            int iHashCode = this.startDate.hashCode() * 31;
            TimeStampAndZone timeStampAndZone = this.endDate;
            return ((iHashCode + (timeStampAndZone != null ? timeStampAndZone.hashCode() : 0)) * 31) + Arrays.hashCode(this.restDays);
        }

        @NotNull
        public String toString() {
            return "PHNProjectSetting(startDate=" + this.startDate + ", endDate=" + this.endDate + ", restDays=" + Arrays.toString(this.restDays) + ", endType=" + this.endType + ", endReason=" + this.endReason + ")";
        }

        public PHNProjectSetting(@NotNull TimeStampAndZone timeStampAndZone, @Nullable TimeStampAndZone timeStampAndZone2, @NotNull int[] iArr, int i, @NotNull String str) {
            this.startDate = timeStampAndZone;
            this.endDate = timeStampAndZone2;
            this.restDays = iArr;
            this.endType = i;
            this.endReason = str;
        }

        public /* synthetic */ PHNProjectSetting(TimeStampAndZone timeStampAndZone, TimeStampAndZone timeStampAndZone2, int[] iArr, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(timeStampAndZone, (i2 & 2) != 0 ? null : timeStampAndZone2, iArr, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PHNProjectRecord(int i, @SerialName("timestamp") long j, @SerialName("version") String str, @SerialName("setting") PHNProjectSetting pHNProjectSetting, @SerialName("result") JsonObject jsonObject, @SerialName("source") int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, PHNProjectRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.version = "0.0.0";
        } else {
            this.version = str;
        }
        this.setting = pHNProjectSetting;
        this.result = jsonObject;
        if ((i & 16) == 0) {
            this.source = -1;
        } else {
            this.source = i2;
        }
        this.synced = 0;
    }

    @SerialName("result")
    public static /* synthetic */ void getResult$annotations() {
    }

    @SerialName("setting")
    public static /* synthetic */ void getSetting$annotations() {
    }

    @SerialName("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @Transient
    public static /* synthetic */ void getSynced$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PHNProjectRecord self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.timestamp != 0) {
            output.encodeLongElement(serialDesc, 0, self.timestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.version, "0.0.0")) {
            output.encodeStringElement(serialDesc, 1, self.version);
        }
        output.encodeSerializableElement(serialDesc, 2, PHNProjectRecord$PHNProjectSetting$$serializer.INSTANCE, self.setting);
        output.encodeNullableSerializableElement(serialDesc, 3, JsonObjectSerializer.INSTANCE, self.result);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.source != -1) {
            output.encodeIntElement(serialDesc, 4, self.source);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PHNProjectSetting getSetting() {
        return this.setting;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSynced() {
        return this.synced;
    }

    @NotNull
    public final PHNProjectRecord copy(long timestamp, @NotNull String version, @NotNull PHNProjectSetting setting, @Nullable JsonObject result, int source, int synced) {
        return new PHNProjectRecord(timestamp, version, setting, result, source, synced);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNProjectRecord)) {
            return false;
        }
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) other;
        return this.timestamp == pHNProjectRecord.timestamp && Intrinsics.areEqual(this.version, pHNProjectRecord.version) && Intrinsics.areEqual(this.setting, pHNProjectRecord.setting) && Intrinsics.areEqual(this.result, pHNProjectRecord.result) && this.source == pHNProjectRecord.source && this.synced == pHNProjectRecord.synced;
    }

    @Nullable
    public final JsonObject getResult() {
        return this.result;
    }

    @NotNull
    public final PHNProjectSetting getSetting() {
        return this.setting;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getSynced() {
        return this.synced;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iA = ((((b.a(this.timestamp) * 31) + this.version.hashCode()) * 31) + this.setting.hashCode()) * 31;
        JsonObject jsonObject = this.result;
        return ((((iA + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31) + this.source) * 31) + this.synced;
    }

    public final void setSynced(int i) {
        this.synced = i;
    }

    public final void stateChangeByApp() {
        this.synced = 0;
    }

    public final void stateChangeByServer() {
        this.synced = 1;
    }

    @NotNull
    public String toString() {
        return "PHNProjectRecord(timestamp=" + this.timestamp + ", version=" + this.version + ", setting=" + this.setting + ", result=" + this.result + ", source=" + this.source + ", synced=" + this.synced + ")";
    }

    public PHNProjectRecord(long j, @NotNull String str, @NotNull PHNProjectSetting pHNProjectSetting, @Nullable JsonObject jsonObject, int i, int i2) {
        this.timestamp = j;
        this.version = str;
        this.setting = pHNProjectSetting;
        this.result = jsonObject;
        this.source = i;
        this.synced = i2;
    }

    public /* synthetic */ PHNProjectRecord(long j, String str, PHNProjectSetting pHNProjectSetting, JsonObject jsonObject, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "0.0.0" : str, pHNProjectSetting, jsonObject, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? 0 : i2);
    }
}
