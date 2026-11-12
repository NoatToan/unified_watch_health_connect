package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class sky {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile sky f48303b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48304a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48305c;
    private int e;

    sky() {
    }

    public static sky e() {
        if (f48303b == null) {
            synchronized (sky.class) {
                if (f48303b == null) {
                    f48303b = new sky();
                }
            }
        }
        return f48303b;
    }

    public void b() {
        final int i = this.f48305c + 1;
        LogUtil.a("AudioRequestHelper", "updateWorkoutsByTopicId. sTopicId = ", this.f48304a, "; updatePageNum = ", Integer.valueOf(i), "; mTotalSize = ", Integer.valueOf(this.e));
        if (i * 20 >= this.e) {
            LogUtil.a("AudioRequestHelper", "finish update this topic playlist. no need to update.");
        } else {
            skz.a(this.f48304a, new BiConsumer<List<sni>, Integer>() { // from class: sky.2
                @Override // com.google.android.gms.common.util.BiConsumer
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void accept(List<sni> list, Integer num) {
                    if (CollectionUtils.isEmpty(list)) {
                        LogUtil.j("AudioRequestHelper", "audioWorkoutByTopicList is empty, no need to update");
                        return;
                    }
                    List<snk> listE = skz.e(list);
                    LogUtil.a("AudioRequestHelper", "requestWorkoutsByTopicId result updatePageNum = ", Integer.valueOf(i), ", result size = ", Integer.valueOf(listE.size()));
                    List<gdy> listB = skz.b(listE);
                    if (!CollectionUtils.isEmpty(listB) && !CollectionUtils.isEmpty(listE)) {
                        sky.this.f48305c = i;
                        sky.this.e = num.intValue();
                    }
                    smp.b().e(listB, listE);
                }
            }, i);
        }
    }

    public void d(final String str, final BiConsumer<List<gdy>, List<snk>> biConsumer, final int i) {
        skz.a(str, new BiConsumer<List<sni>, Integer>() { // from class: sky.5
            @Override // com.google.android.gms.common.util.BiConsumer
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void accept(List<sni> list, Integer num) {
                if (CollectionUtils.isEmpty(list)) {
                    biConsumer.accept(null, null);
                    return;
                }
                List<snk> listE = skz.e(list);
                LogUtil.a("AudioRequestHelper", "requestWorkoutsByTopicId result pageNum = ", Integer.valueOf(i), ", result size = ", Integer.valueOf(listE.size()), "; totalSize = ", num);
                List<gdy> listB = skz.b(listE);
                if (!CollectionUtils.isEmpty(listB) && !CollectionUtils.isEmpty(listE)) {
                    sky.this.f48305c = i;
                    sky.this.f48304a = str;
                    sky.this.e = num.intValue();
                }
                biConsumer.accept(listB, listE);
            }
        }, i);
    }

    public boolean d(int i, String str) {
        if (!TextUtils.equals(str, this.f48304a)) {
            LogUtil.a("AudioRequestHelper", "topicId is not same. input topicId = ", str, "; sTopicId = ", this.f48304a);
            return true;
        }
        int size = smp.b().u().size();
        LogUtil.a("AudioRequestHelper", "pageNum = ", Integer.valueOf(i), "; sTopicPageNum = ", Integer.valueOf(this.f48305c), "; topicId = ", str, "; sTopicId = ", this.f48304a, "; PlayList.size() = ", Integer.valueOf(size));
        return this.f48305c <= 0 || this.e > size;
    }
}
