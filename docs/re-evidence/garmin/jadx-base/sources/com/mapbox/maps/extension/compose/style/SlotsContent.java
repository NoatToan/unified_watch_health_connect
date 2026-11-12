package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p3.m;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B*\b\u0000\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u0002HÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR1\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/SlotsContent;", "", "", "", "Lkotlin/Function0;", "", "Lcom/mapbox/maps/extension/compose/MapboxMapComposable;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "(Ljava/util/Map;)V", "name", FirebaseAnalytics.Param.CONTENT, "slot", "(Ljava/lang/String;Le23/p;)V", "component1$extension_compose_release", "()Ljava/util/Map;", "component1", "copy", "(Ljava/util/Map;)Lcom/mapbox/maps/extension/compose/style/SlotsContent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getEntries$extension_compose_release", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SlotsContent {
    private final Map<String, p<m, Integer, Unit>> entries;

    public /* synthetic */ SlotsContent(Map map, int i14, j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotsContent copy$default(SlotsContent slotsContent, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            map = slotsContent.entries;
        }
        return slotsContent.copy(map);
    }

    public final Map<String, p<m, Integer, Unit>> component1$extension_compose_release() {
        return this.entries;
    }

    public final SlotsContent copy(Map<String, p<m, Integer, Unit>> entries) {
        entries.getClass();
        return new SlotsContent(entries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SlotsContent) && s.g(this.entries, ((SlotsContent) other).entries);
    }

    public final Map<String, p<m, Integer, Unit>> getEntries$extension_compose_release() {
        return this.entries;
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public final void slot(String name, p<? super m, ? super Integer, Unit> content) {
        name.getClass();
        content.getClass();
        if (this.entries.containsKey(name)) {
            h.s(am.j.m("Slot [", name, "] already has content."));
        } else {
            this.entries.put(name, content);
        }
    }

    public String toString() {
        return "SlotsContent(entries=" + this.entries + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SlotsContent(Map<String, p<m, Integer, Unit>> map) {
        map.getClass();
        this.entries = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlotsContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
