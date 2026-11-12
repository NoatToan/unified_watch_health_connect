package com.xiaomi.fitness.aivs.request.model;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u0095\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0007HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\rHÖ\u0001J\t\u0010=\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001c¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/Suggestion;", "", "card_color", "Lcom/xiaomi/fitness/aivs/request/model/CardColor;", "debug_info", "Lcom/xiaomi/fitness/aivs/request/model/DebugInfo;", "domain", "", "exe_pkg_name", "headline_background", "icon_url", "id", "min_version", "", SearchIntents.EXTRA_QUERY, "send_query", "source", "suggest_query_type", "suggest_score", "", "ui_template", "<init>", "(Lcom/xiaomi/fitness/aivs/request/model/CardColor;Lcom/xiaomi/fitness/aivs/request/model/DebugInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getCard_color", "()Lcom/xiaomi/fitness/aivs/request/model/CardColor;", "getDebug_info", "()Lcom/xiaomi/fitness/aivs/request/model/DebugInfo;", "getDomain", "()Ljava/lang/String;", "getExe_pkg_name", "getHeadline_background", "getIcon_url", "getId", "getMin_version", "()I", "getQuery", "getSend_query", "getSource", "getSuggest_query_type", "getSuggest_score", "()D", "getUi_template", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Suggestion {

    @NotNull
    private final CardColor card_color;

    @NotNull
    private final DebugInfo debug_info;

    @NotNull
    private final String domain;

    @NotNull
    private final String exe_pkg_name;

    @NotNull
    private final String headline_background;

    @NotNull
    private final String icon_url;

    @NotNull
    private final String id;
    private final int min_version;

    @NotNull
    private final String query;

    @NotNull
    private final String send_query;

    @NotNull
    private final String source;

    @NotNull
    private final String suggest_query_type;
    private final double suggest_score;

    @NotNull
    private final String ui_template;

    public Suggestion(@NotNull CardColor card_color, @NotNull DebugInfo debug_info, @NotNull String domain, @NotNull String exe_pkg_name, @NotNull String headline_background, @NotNull String icon_url, @NotNull String id, int i, @NotNull String query, @NotNull String send_query, @NotNull String source, @NotNull String suggest_query_type, double d, @NotNull String ui_template) {
        Intrinsics.checkNotNullParameter(card_color, "card_color");
        Intrinsics.checkNotNullParameter(debug_info, "debug_info");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(exe_pkg_name, "exe_pkg_name");
        Intrinsics.checkNotNullParameter(headline_background, "headline_background");
        Intrinsics.checkNotNullParameter(icon_url, "icon_url");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(send_query, "send_query");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(suggest_query_type, "suggest_query_type");
        Intrinsics.checkNotNullParameter(ui_template, "ui_template");
        this.card_color = card_color;
        this.debug_info = debug_info;
        this.domain = domain;
        this.exe_pkg_name = exe_pkg_name;
        this.headline_background = headline_background;
        this.icon_url = icon_url;
        this.id = id;
        this.min_version = i;
        this.query = query;
        this.send_query = send_query;
        this.source = source;
        this.suggest_query_type = suggest_query_type;
        this.suggest_score = d;
        this.ui_template = ui_template;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardColor getCard_color() {
        return this.card_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSend_query() {
        return this.send_query;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSuggest_query_type() {
        return this.suggest_query_type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getSuggest_score() {
        return this.suggest_score;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUi_template() {
        return this.ui_template;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DebugInfo getDebug_info() {
        return this.debug_info;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExe_pkg_name() {
        return this.exe_pkg_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeadline_background() {
        return this.headline_background;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon_url() {
        return this.icon_url;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMin_version() {
        return this.min_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final Suggestion copy(@NotNull CardColor card_color, @NotNull DebugInfo debug_info, @NotNull String domain, @NotNull String exe_pkg_name, @NotNull String headline_background, @NotNull String icon_url, @NotNull String id, int min_version, @NotNull String query, @NotNull String send_query, @NotNull String source, @NotNull String suggest_query_type, double suggest_score, @NotNull String ui_template) {
        Intrinsics.checkNotNullParameter(card_color, "card_color");
        Intrinsics.checkNotNullParameter(debug_info, "debug_info");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(exe_pkg_name, "exe_pkg_name");
        Intrinsics.checkNotNullParameter(headline_background, "headline_background");
        Intrinsics.checkNotNullParameter(icon_url, "icon_url");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(send_query, "send_query");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(suggest_query_type, "suggest_query_type");
        Intrinsics.checkNotNullParameter(ui_template, "ui_template");
        return new Suggestion(card_color, debug_info, domain, exe_pkg_name, headline_background, icon_url, id, min_version, query, send_query, source, suggest_query_type, suggest_score, ui_template);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) other;
        return Intrinsics.areEqual(this.card_color, suggestion.card_color) && Intrinsics.areEqual(this.debug_info, suggestion.debug_info) && Intrinsics.areEqual(this.domain, suggestion.domain) && Intrinsics.areEqual(this.exe_pkg_name, suggestion.exe_pkg_name) && Intrinsics.areEqual(this.headline_background, suggestion.headline_background) && Intrinsics.areEqual(this.icon_url, suggestion.icon_url) && Intrinsics.areEqual(this.id, suggestion.id) && this.min_version == suggestion.min_version && Intrinsics.areEqual(this.query, suggestion.query) && Intrinsics.areEqual(this.send_query, suggestion.send_query) && Intrinsics.areEqual(this.source, suggestion.source) && Intrinsics.areEqual(this.suggest_query_type, suggestion.suggest_query_type) && Double.compare(this.suggest_score, suggestion.suggest_score) == 0 && Intrinsics.areEqual(this.ui_template, suggestion.ui_template);
    }

    @NotNull
    public final CardColor getCard_color() {
        return this.card_color;
    }

    @NotNull
    public final DebugInfo getDebug_info() {
        return this.debug_info;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getExe_pkg_name() {
        return this.exe_pkg_name;
    }

    @NotNull
    public final String getHeadline_background() {
        return this.headline_background;
    }

    @NotNull
    public final String getIcon_url() {
        return this.icon_url;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getMin_version() {
        return this.min_version;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final String getSend_query() {
        return this.send_query;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getSuggest_query_type() {
        return this.suggest_query_type;
    }

    public final double getSuggest_score() {
        return this.suggest_score;
    }

    @NotNull
    public final String getUi_template() {
        return this.ui_template;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.card_color.hashCode() * 31) + this.debug_info.hashCode()) * 31) + this.domain.hashCode()) * 31) + this.exe_pkg_name.hashCode()) * 31) + this.headline_background.hashCode()) * 31) + this.icon_url.hashCode()) * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.min_version)) * 31) + this.query.hashCode()) * 31) + this.send_query.hashCode()) * 31) + this.source.hashCode()) * 31) + this.suggest_query_type.hashCode()) * 31) + Double.hashCode(this.suggest_score)) * 31) + this.ui_template.hashCode();
    }

    @NotNull
    public String toString() {
        return "Suggestion(card_color=" + this.card_color + ", debug_info=" + this.debug_info + ", domain=" + this.domain + ", exe_pkg_name=" + this.exe_pkg_name + ", headline_background=" + this.headline_background + ", icon_url=" + this.icon_url + ", id=" + this.id + ", min_version=" + this.min_version + ", query=" + this.query + ", send_query=" + this.send_query + ", source=" + this.source + ", suggest_query_type=" + this.suggest_query_type + ", suggest_score=" + this.suggest_score + ", ui_template=" + this.ui_template + ")";
    }
}
