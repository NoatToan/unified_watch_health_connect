package qj0;

import c83.a0;
import i83.s;
import i83.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000bJ:\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lqj0/m;", "", "", "contentfulEnvironment", "locale", "", "showUnpublishedContent", "Lc83/a0;", "Lqj0/i;", "Lqj0/g;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLt13/d;)Ljava/lang/Object;", "Lqj0/h;", "a", "Lqj0/a;", "c", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m {
    @i83.f("v1/c52zzr48vab4/{environment}/contentType/subscriptionPlanSelection/{locale}")
    Object a(@s("environment") String str, @s("locale") String str2, @t("unpublished") boolean z14, t13.d<? super a0<i<h>>> dVar);

    @i83.f("v1/c52zzr48vab4/{environment}/contentType/subscriptionPaywall/{locale}")
    Object b(@s("environment") String str, @s("locale") String str2, @t("unpublished") boolean z14, t13.d<? super a0<i<g>>> dVar);

    @i83.f("v1/c52zzr48vab4/{environment}/contentType/subscriptionEducation/{locale}")
    Object c(@s("environment") String str, @s("locale") String str2, @t("unpublished") boolean z14, t13.d<? super a0<i<a>>> dVar);
}
