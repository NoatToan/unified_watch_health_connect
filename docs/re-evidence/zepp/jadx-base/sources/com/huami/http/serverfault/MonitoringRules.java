package com.huami.http.serverfault;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/http/serverfault/MonitoringRules;", "", "", "component1", "Lkotlin/text/Regex;", "component2", "tag", "rule", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "Lkotlin/text/Regex;", "getRule", "()Lkotlin/text/Regex;", "<init>", "(Ljava/lang/String;Lkotlin/text/Regex;)V", "serverfault_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class MonitoringRules {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Regex rule;

    public MonitoringRules(@NotNull String str, @NotNull Regex regex) {
        this.tag = str;
        this.rule = regex;
    }

    public static /* synthetic */ MonitoringRules copy$default(MonitoringRules monitoringRules, String str, Regex regex, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monitoringRules.tag;
        }
        if ((i & 2) != 0) {
            regex = monitoringRules.rule;
        }
        return monitoringRules.copy(str, regex);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Regex getRule() {
        return this.rule;
    }

    @NotNull
    public final MonitoringRules copy(@NotNull String tag, @NotNull Regex rule) {
        return new MonitoringRules(tag, rule);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonitoringRules)) {
            return false;
        }
        MonitoringRules monitoringRules = (MonitoringRules) other;
        return Intrinsics.areEqual(this.tag, monitoringRules.tag) && Intrinsics.areEqual(this.rule, monitoringRules.rule);
    }

    @NotNull
    public final Regex getRule() {
        return this.rule;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.tag;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Regex regex = this.rule;
        return iHashCode + (regex != null ? regex.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MonitoringRules(tag=" + this.tag + ", rule=" + this.rule + ")";
    }
}
