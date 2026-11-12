package com.example.statistics.export;

import com.xiaomi.onetrack.c.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010#\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JQ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R,\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006+"}, d2 = {"Lcom/example/statistics/export/TrackContentBean;", "Lcom/example/statistics/export/TrackContent;", "key", "", "repeatEnable", "", i.d, "params", "", "", "exposePercent", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;F)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getRepeatEnable", "()Z", "setRepeatEnable", "(Z)V", "getEventName", "setEventName", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "getExposePercent", "()F", "setExposePercent", "(F)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrackContentBean implements TrackContent {

    @Nullable
    private String eventName;
    private float exposePercent;

    @Nullable
    private String key;

    @Nullable
    private Map<String, ? extends Object> params;
    private boolean repeatEnable;

    public TrackContentBean(@Nullable String str, boolean z, @Nullable String str2, @Nullable Map<String, ? extends Object> map, float f) {
        this.key = str;
        this.repeatEnable = z;
        this.eventName = str2;
        this.params = map;
        this.exposePercent = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackContentBean copy$default(TrackContentBean trackContentBean, String str, boolean z, String str2, Map map, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackContentBean.key;
        }
        if ((i & 2) != 0) {
            z = trackContentBean.repeatEnable;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = trackContentBean.eventName;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            map = trackContentBean.params;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            f = trackContentBean.exposePercent;
        }
        return trackContentBean.copy(str, z2, str3, map2, f);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRepeatEnable() {
        return this.repeatEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.params;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getExposePercent() {
        return this.exposePercent;
    }

    @NotNull
    public final TrackContentBean copy(@Nullable String key, boolean repeatEnable, @Nullable String eventName, @Nullable Map<String, ? extends Object> params, float exposePercent) {
        return new TrackContentBean(key, repeatEnable, eventName, params, exposePercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackContentBean)) {
            return false;
        }
        TrackContentBean trackContentBean = (TrackContentBean) other;
        return Intrinsics.areEqual(this.key, trackContentBean.key) && this.repeatEnable == trackContentBean.repeatEnable && Intrinsics.areEqual(this.eventName, trackContentBean.eventName) && Intrinsics.areEqual(this.params, trackContentBean.params) && Float.compare(this.exposePercent, trackContentBean.exposePercent) == 0;
    }

    @Override // com.example.statistics.export.TrackContent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.example.statistics.export.TrackContent
    public float getExposePercent() {
        return this.exposePercent;
    }

    @Override // com.example.statistics.export.TrackContent
    @Nullable
    public String getKey() {
        return this.key;
    }

    @Override // com.example.statistics.export.TrackContent
    @Nullable
    public Map<String, Object> getParams() {
        return this.params;
    }

    @Override // com.example.statistics.export.TrackContent
    public boolean getRepeatEnable() {
        return this.repeatEnable;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.repeatEnable)) * 31;
        String str2 = this.eventName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, ? extends Object> map = this.params;
        return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + Float.hashCode(this.exposePercent);
    }

    @Override // com.example.statistics.export.TrackContent
    public void setEventName(@Nullable String str) {
        this.eventName = str;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setExposePercent(float f) {
        this.exposePercent = f;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setKey(@Nullable String str) {
        this.key = str;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setParams(@Nullable Map<String, ? extends Object> map) {
        this.params = map;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setRepeatEnable(boolean z) {
        this.repeatEnable = z;
    }

    @NotNull
    public String toString() {
        return "TrackContentBean(key=" + this.key + ", repeatEnable=" + this.repeatEnable + ", eventName=" + this.eventName + ", params=" + this.params + ", exposePercent=" + this.exposePercent + ")";
    }

    public /* synthetic */ TrackContentBean(String str, boolean z, String str2, Map map, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, map, (i & 16) != 0 ? 0.67f : f);
    }
}
