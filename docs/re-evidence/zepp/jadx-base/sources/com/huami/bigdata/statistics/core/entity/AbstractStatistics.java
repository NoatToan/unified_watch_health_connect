package com.huami.bigdata.statistics.core.entity;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "", "maxTime", "J", "getMaxTime", "()J", "setMaxTime", "(J)V", "timezoneId", "Ljava/lang/String;", "getTimezoneId", "()Ljava/lang/String;", "setTimezoneId", "(Ljava/lang/String;)V", "", "dataArray", "Ljava/util/List;", "getDataArray", "()Ljava/util/List;", "setDataArray", "(Ljava/util/List;)V", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractStatistics<T extends AbstractDateData> {
    private long maxTime;

    @SerializedName("timezone")
    @NotNull
    private String timezoneId = TimeZone.getDefault().getID();

    @NotNull
    private List<? extends T> dataArray = new ArrayList();

    @NotNull
    public final List<T> getDataArray() {
        return this.dataArray;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    @NotNull
    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public final void setDataArray(@NotNull List<? extends T> list) {
        this.dataArray = list;
    }

    public final void setMaxTime(long j) {
        this.maxTime = j;
    }

    public final void setTimezoneId(@NotNull String str) {
        this.timezoneId = str;
    }

    @NotNull
    public String toString() {
        return new Gson().toJson(this);
    }
}
