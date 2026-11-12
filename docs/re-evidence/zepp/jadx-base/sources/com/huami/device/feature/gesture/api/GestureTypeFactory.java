package com.huami.device.feature.gesture.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/huami/device/feature/gesture/api/GestureTypeFactory;", "", "<init>", "()V", "Companion", "GestureState", "GestureType", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class GestureTypeFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final GestureType a;

    @NotNull
    private static final GestureType b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/device/feature/gesture/api/GestureTypeFactory$Companion;", "", "", "t", "", GoogleApiAvailabilityLight.b, "Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureType;", "create", "GESTURE_TYPE_SQUEEZE", "Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureType;", "getGESTURE_TYPE_SQUEEZE", "()Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureType;", "GESTURE_TYPE_TAP", "getGESTURE_TYPE_TAP", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GestureType create(int t, @NotNull String n) {
            return new GestureType(t, n);
        }

        @NotNull
        public final GestureType getGESTURE_TYPE_SQUEEZE() {
            return GestureTypeFactory.a;
        }

        @NotNull
        public final GestureType getGESTURE_TYPE_TAP() {
            return GestureTypeFactory.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureState;", "", "", "component1", "component2", "type", "state", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "b", "getState", "<init>", "(II)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class GestureState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int state;

        public GestureState(int i, int i2) {
            this.type = i;
            this.state = i2;
        }

        public static /* synthetic */ GestureState copy$default(GestureState gestureState, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = gestureState.type;
            }
            if ((i3 & 2) != 0) {
                i2 = gestureState.state;
            }
            return gestureState.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getState() {
            return this.state;
        }

        @NotNull
        public final GestureState copy(int type, int state) {
            return new GestureState(type, state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GestureState)) {
                return false;
            }
            GestureState gestureState = (GestureState) other;
            return this.type == gestureState.type && this.state == gestureState.state;
        }

        public final int getState() {
            return this.state;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type * 31) + this.state;
        }

        @NotNull
        public String toString() {
            return "GestureState(type=" + this.type + ", state=" + this.state + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureType;", "", "other", "", "equals", "", "hashCode", "component1", "", "component2", "type", "name", "copy", "toString", "a", LogUtil.I, "getType", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class GestureType {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        public GestureType(int i, @NotNull String str) {
            this.type = i;
            this.name = str;
        }

        public static /* synthetic */ GestureType copy$default(GestureType gestureType, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = gestureType.type;
            }
            if ((i2 & 2) != 0) {
                str = gestureType.name;
            }
            return gestureType.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final GestureType copy(int type, @NotNull String name) {
            return new GestureType(type, name);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof GestureType) && this.type == ((GestureType) other).type;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "GestureType(type=" + this.type + ", name=" + this.name + ')';
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        a = companion.create(0, "握拳");
        b = companion.create(1, "敲食指");
    }
}
