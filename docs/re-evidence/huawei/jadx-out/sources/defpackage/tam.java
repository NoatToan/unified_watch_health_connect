package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.SearchResultFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class tam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<SearchResultFragment> f48861a;
    private ConcurrentHashMap<Integer, Object> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private tap f48862b = new tap();

    public tam(SearchResultFragment searchResultFragment) {
        this.f48861a = new WeakReference<>(searchResultFragment);
    }

    public void e(final String str) {
        if (b()) {
            final int i = 203;
            if (TextUtils.isEmpty(str)) {
                c(203, false);
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: tam.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Map<String, Object> mapA = tam.this.f48862b.a(str);
                        if (!mapA.containsKey("ALL_DEVICE_KEY") || !mapA.containsKey("CONNECTED_DEVICE_KEY")) {
                            tam.this.c(i, false);
                        } else {
                            tam.this.d.put(Integer.valueOf(i), mapA);
                            tam.this.c(i, true);
                        }
                    }
                });
            }
        }
    }

    public static boolean e() {
        if (!TextUtils.isEmpty(GlobalSearchActivity.a())) {
            return true;
        }
        LogUtil.a("SearchUtils", "isLessonAggregateSearch lessonSubCategory is null");
        return false;
    }

    public void b(final String str) {
        boolean zAwait;
        if (b()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: tam.5
                    @Override // java.lang.Runnable
                    public void run() {
                        tam.this.b(str);
                    }
                });
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(e() ? 1 : 2);
            final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ThreadPoolManager.c().execute(new Runnable() { // from class: tam.3
                @Override // java.lang.Runnable
                public void run() {
                    fyb.e(str, new UiCallback<List<GlobalSearchResult>>() { // from class: tam.3.1
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i, String str2) {
                            countDownLatch.countDown();
                            LogUtil.e("SearchUtils", "doOverAllSearch failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str2, " latch count = ", Long.valueOf(countDownLatch.getCount()));
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(List<GlobalSearchResult> list) {
                            copyOnWriteArrayList.addAll(list);
                            countDownLatch.countDown();
                            LogUtil.a("SearchUtils", "doOverAllSearch found, show data in the overall result latch count = ", Long.valueOf(countDownLatch.getCount()));
                        }
                    }, GlobalSearchActivity.a());
                }
            });
            if (!e()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: tam.2
                    @Override // java.lang.Runnable
                    public void run() {
                        fxs.a(str, new UiCallback<GlobalSearchResult>() { // from class: tam.2.2
                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            public void onFailure(int i, String str2) {
                                countDownLatch.countDown();
                                LogUtil.e("SearchUtils", "doMaterialSearch failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str2, " latch count = ", Long.valueOf(countDownLatch.getCount()));
                            }

                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(GlobalSearchResult globalSearchResult) {
                                copyOnWriteArrayList.add(globalSearchResult);
                                countDownLatch.countDown();
                                LogUtil.a("SearchUtils", "doMaterialSearch found, show materials in the overall result!latch count = ", Long.valueOf(countDownLatch.getCount()));
                            }
                        });
                    }
                });
            }
            try {
                LogUtil.e("SearchUtils", "doOverallAndMaterialSearch waiting!");
                zAwait = countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                try {
                    LogUtil.e("SearchUtils", "doOverallAndMaterialSearch waiting done! latch ", Long.valueOf(countDownLatch.getCount()));
                } catch (InterruptedException unused) {
                    LogUtil.e("SearchUtils", "doOverallAndMaterialSearch interrupted!");
                }
            } catch (InterruptedException unused2) {
                zAwait = false;
            }
            if (!zAwait) {
                LogUtil.e("SearchUtils", "doOverallAndMaterialSearch time out!");
            }
            if (njy.b(copyOnWriteArrayList)) {
                c(200, copyOnWriteArrayList);
            } else {
                c(200, false);
            }
        }
    }

    private void c(int i, List<GlobalSearchResult> list) {
        SearchResultFragment searchResultFragment = this.f48861a.get();
        if (searchResultFragment == null) {
            return;
        }
        if (njy.e(list)) {
            searchResultFragment.a(i, false);
            return;
        }
        Iterator<GlobalSearchResult> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            GlobalSearchResult next = it.next();
            if (next == null) {
                it.remove();
            } else if (!njy.e(next.getContent())) {
                z = false;
            }
        }
        if (z) {
            searchResultFragment.a(i, false);
        } else {
            this.d.put(Integer.valueOf(i), list);
            searchResultFragment.a(i, true);
        }
    }

    public Object d(int i) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.d.get(Integer.valueOf(i));
    }

    public List<GlobalSearchContent> b(int i) {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            Object obj = concurrentHashMap.get(200);
            if (!njy.b(obj, GlobalSearchResult.class)) {
                LogUtil.a("SearchUtils", "not match GlobalSearchResult");
                return arrayList;
            }
            for (GlobalSearchResult globalSearchResult : (List) obj) {
                Integer num = gvk.f36089b.get(globalSearchResult.getCategoryId());
                if (num != null && num.intValue() == i) {
                    List<GlobalSearchContent> content = globalSearchResult.getContent();
                    if (!njy.e(content)) {
                        return content;
                    }
                }
            }
        }
        return arrayList;
    }

    public void a() {
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    private boolean b() {
        WeakReference<SearchResultFragment> weakReference = this.f48861a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, boolean z) {
        SearchResultFragment searchResultFragment;
        WeakReference<SearchResultFragment> weakReference = this.f48861a;
        if (weakReference == null || (searchResultFragment = weakReference.get()) == null) {
            return;
        }
        searchResultFragment.a(i, z);
    }
}
