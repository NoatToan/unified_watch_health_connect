package com.xiaomi.fitness.track;

import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.hoi;
import defpackage.j1j;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B/\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "Ljava/io/Serializable;", "icon", "", "title", "", "desc", "fileType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()I", "getTitle", "()Ljava/lang/String;", "getDesc", "getFileType", ParserHelper.GPX, ParserHelper.KML, ParserHelper.TCX, "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$GPX;", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$KML;", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$TCX;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExportTrackSupportTypeData implements Serializable {

    @NotNull
    private final String desc;

    @NotNull
    private final String fileType;
    private final int icon;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$GPX;", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GPX extends ExportTrackSupportTypeData {

        @NotNull
        public static final GPX INSTANCE = new GPX();

        private GPX() {
            super(hoi.w, ".gpx", ResourceExtKt.getString(j1j.j), ParserHelper.GPX, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$KML;", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KML extends ExportTrackSupportTypeData {

        @NotNull
        public static final KML INSTANCE = new KML();

        private KML() {
            super(hoi.w, ".kml", ResourceExtKt.getString(j1j.n), ParserHelper.KML, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData$TCX;", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TCX extends ExportTrackSupportTypeData {

        @NotNull
        public static final TCX INSTANCE = new TCX();

        private TCX() {
            super(hoi.w, ".tcx", ResourceExtKt.getString(j1j.p), ParserHelper.TCX, null);
        }
    }

    public /* synthetic */ ExportTrackSupportTypeData(int i, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    private ExportTrackSupportTypeData(int i, String str, String str2, String str3) {
        this.icon = i;
        this.title = str;
        this.desc = str2;
        this.fileType = str3;
    }

    public /* synthetic */ ExportTrackSupportTypeData(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, str3, null);
    }
}
