package defpackage;

import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.backlog.BacklogInterface;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class rjf implements BacklogInterface {
    @Override // com.huawei.ui.homehealth.backlog.BacklogInterface
    public CompletableFuture<List<dse>> requestBacklog(final DeviceInfo deviceInfo) {
        return rjk.d(4206, 4500L).thenApply(new Function() { // from class: rje
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f47378a.e((Optional) obj);
            }
        }).thenApply((Function<? super U, ? extends U>) new Function<List<dsg>, List<dse>>() { // from class: rjf.1
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<dse> apply(List<dsg> list) {
                String strB = SharedPreferenceManager.b("MARKETING_BACKLOG", "MARKETING_BACKLOG_VISITED", "");
                return (List) Optional.ofNullable(list).map(new AnonymousClass2(SharedPreferenceManager.b("MARKETING_BACKLOG", "MARKETING_BACKLOG_DELETED", ""), strB)).orElse(Collections.EMPTY_LIST);
            }

            /* JADX INFO: renamed from: rjf$1$2, reason: invalid class name */
            class AnonymousClass2 implements Function<List<dsg>, List<dse>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f47381b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f47382c;

                AnonymousClass2(String str, String str2) {
                    this.f47381b = str;
                    this.f47382c = str2;
                }

                @Override // java.util.function.Function
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public List<dse> apply(List<dsg> list) {
                    Stream<dsg> stream = list.stream();
                    final String str = this.f47381b;
                    Stream<dsg> streamFilter = stream.filter(new Predicate() { // from class: rjm
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return rjf.AnonymousClass1.AnonymousClass2.b(str, (dsg) obj);
                        }
                    });
                    final DeviceInfo deviceInfo = deviceInfo;
                    final String str2 = this.f47382c;
                    return (List) streamFilter.map(new Function() { // from class: rjj
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return rjf.AnonymousClass1.AnonymousClass2.e(deviceInfo, str2, (dsg) obj);
                        }
                    }).collect(Collectors.toList());
                }

                static /* synthetic */ boolean b(String str, dsg dsgVar) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    return dsgVar.b() <= jCurrentTimeMillis && dsgVar.c() >= jCurrentTimeMillis && !str.contains(dsgVar.a());
                }

                static /* synthetic */ dse e(DeviceInfo deviceInfo, String str, dsg dsgVar) {
                    dse dseVar = new dse("marketing_" + dsgVar.a(), dsgVar.e());
                    dseVar.b(deviceInfo.getDeviceIdentify());
                    dseVar.d(dsgVar.d());
                    dseVar.a(dsgVar);
                    dseVar.c(str.contains(dsgVar.a()));
                    return dseVar;
                }
            }
        });
    }

    @Override // com.huawei.ui.homehealth.backlog.BacklogInterface
    public void updateVisitedStatus(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback) {
        if (!str.startsWith("marketing_")) {
            throw new IllegalArgumentException("tag not startsWith marketing_");
        }
        ReleaseLogUtil.d("R_MarketBacklogImpl", "updateVisitedStatus tag is", str);
        b("MARKETING_BACKLOG_VISITED", str.substring(10));
        backLogCallback.onSuccess(true);
    }

    @Override // com.huawei.ui.homehealth.backlog.BacklogInterface
    public void updateDeleteStatus(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback) {
        if (!str.startsWith("marketing_")) {
            throw new IllegalArgumentException("tag not startsWith marketing_");
        }
        ReleaseLogUtil.d("R_MarketBacklogImpl", "updateDeleteStatus tag is", str);
        b("MARKETING_BACKLOG_DELETED", str.substring(10));
        backLogCallback.onSuccess(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<dsg> e(Optional<ResourceResultInfo> optional) {
        return (List) optional.map(new Function() { // from class: rjh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ResourceResultInfo) obj).getResources();
            }
        }).map(new Function() { // from class: rjg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rjf.a((List) obj);
            }
        }).orElse(Collections.EMPTY_LIST);
    }

    static /* synthetic */ List a(List list) {
        return (List) list.stream().map(new Function() { // from class: rji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rjf.b((ResourceBriefInfo) obj);
            }
        }).filter(new riy()).map(new Function() { // from class: rjl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (dsg) ((Optional) obj).get();
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ Optional b(ResourceBriefInfo resourceBriefInfo) {
        try {
            ResourceContentBase content = resourceBriefInfo.getContent();
            if (content == null) {
                LogUtil.a("MarketBacklogImpl", "baseContent is null");
                return Optional.empty();
            }
            dsg dsgVar = new dsg();
            JSONObject jSONObject = new JSONObject(content.getContent());
            dsgVar.e(resourceBriefInfo.getResourceId());
            dsgVar.h(jSONObject.getString("theme"));
            if (jSONObject.optBoolean("subThemeVisibility", true)) {
                dsgVar.c(jSONObject.optString("subTheme", null));
            }
            dsgVar.d(jSONObject.optString("picture", null));
            dsgVar.a(jSONObject.optString("darkPicture", null));
            dsgVar.b(jSONObject.getString("linkValue"));
            dsgVar.c(jSONObject.optBoolean("operationRecommendFlag", false));
            dsgVar.a(resourceBriefInfo.getPriority());
            dsgVar.b(resourceBriefInfo.getEffectiveTime());
            dsgVar.d(resourceBriefInfo.getExpirationTime());
            ReleaseLogUtil.d("R_MarketBacklogImpl", "mapMarketingBacklogBean id is ", resourceBriefInfo.getResourceId(), "title is ", dsgVar.e(), " order is ", Integer.valueOf(dsgVar.d()), " priority is ", Boolean.valueOf(dsgVar.j()));
            return Optional.of(dsgVar);
        } catch (JSONException unused) {
            LogUtil.e("MarketBacklogImpl", "mapMarketingBacklogList JSONException");
            return Optional.empty();
        }
    }

    private void b(String str, String str2) {
        String strB = SharedPreferenceManager.b("MARKETING_BACKLOG", str, "");
        if (strB.contains(str2)) {
            return;
        }
        SharedPreferenceManager.c("MARKETING_BACKLOG", str, strB.concat("|").concat(str2));
    }
}
