package com.huami.healthlabel.repository;

import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.entry.RecordContent;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.huami.lib.healthlabel.service.LoadData;
import com.huami.lib.healthlabel.service.MixLabel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/healthlabel/repository/Resource;", "", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "homeLabels", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "recordLabels", "Lcom/huami/lib/healthlabel/service/LoadData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.healthlabel.repository.HealthLabelUseCase$loadHealthLabel$1$1", f = "HealthLabelUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HealthLabelUseCase$loadHealthLabel$1$1 extends SuspendLambda implements Function3<Resource<? extends List<? extends HomeHealthLabel>>, Resource<? extends List<? extends HealthTagRecord>>, Continuation<? super LoadData>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    public HealthLabelUseCase$loadHealthLabel$1$1(Continuation<? super HealthLabelUseCase$loadHealthLabel$1$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull Resource<? extends List<HomeHealthLabel>> resource, @NotNull Resource<? extends List<HealthTagRecord>> resource2, @Nullable Continuation<? super LoadData> continuation) {
        HealthLabelUseCase$loadHealthLabel$1$1 healthLabelUseCase$loadHealthLabel$1$1 = new HealthLabelUseCase$loadHealthLabel$1$1(continuation);
        healthLabelUseCase$loadHealthLabel$1$1.b = resource;
        healthLabelUseCase$loadHealthLabel$1$1.c = resource2;
        return healthLabelUseCase$loadHealthLabel$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource resource = (Resource) this.b;
        Resource resource2 = (Resource) this.c;
        HashMap map = new HashMap();
        List list = (List) resource.getData();
        if (list != null) {
            ArrayList<HomeHealthLabel> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((HomeHealthLabel) obj2).isShow()) {
                    arrayList.add(obj2);
                }
            }
            for (HomeHealthLabel homeHealthLabel : arrayList) {
                map.put(homeHealthLabel.getLabelText(), new MixLabel(homeHealthLabel.getLabelId(), homeHealthLabel.getLabelText(), homeHealthLabel.getLabelColor(), homeHealthLabel.isShow(), 0L, 0, homeHealthLabel.getSort(), ColorExtKt.getConvertColor(homeHealthLabel.getLabelColor()), homeHealthLabel.getReason(), 48, null));
            }
        }
        List list2 = (List) resource2.getData();
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                RecordContent recordContent = EntryExtKt.getRecordContent((HealthTagRecord) it2.next());
                String labelText = recordContent == null ? null : recordContent.getLabelText();
                if (labelText != null && map.containsKey(labelText)) {
                    MixLabel mixLabel = (MixLabel) map.get(labelText);
                    map.remove(labelText);
                    mixLabel.setClickCount(mixLabel.getClickCount() + 1);
                    map.put(labelText, mixLabel);
                }
            }
        }
        return new LoadData(resource.getLoadFromDb(), CollectionsKt___CollectionsKt.sortedWith(map.values(), new Comparator<T>() { // from class: com.huami.healthlabel.repository.HealthLabelUseCase$loadHealthLabel$1$1$invokeSuspend$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MixLabel) t).getSort()), Long.valueOf(((MixLabel) t2).getSort()));
            }
        }));
    }
}
