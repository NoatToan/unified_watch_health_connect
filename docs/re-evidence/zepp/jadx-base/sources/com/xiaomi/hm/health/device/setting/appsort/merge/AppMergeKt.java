package com.xiaomi.hm.health.device.setting.appsort.merge;

import androidx.exifinterface.media.ExifInterface;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a:\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001a\b\u0004\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0012\u0004\u0012\u00020\u00000\u0002H\u0086\bø\u0001\u0000\u001aB\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t\u001a8\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u000e*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002\u001a \u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a.\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0006\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "app", "Lkotlin/Function1;", "", "", "merge", "", "newApp", "", "", "groupMaxMap", "groupMain", "groupMore", "mergeWxPay", ExifInterface.GPS_DIRECTION_TRUE, EcgData.GROUP_ID, "", "a", "getAppendItem", "Lcom/xiaomi/hm/health/device/setting/appsort/merge/AppGroup;", "groups", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AppMergeKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "list", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<List<? extends AppItem>, AppItem> {
        public final /* synthetic */ AppItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AppItem appItem) {
            super(1);
            this.a = appItem;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppItem invoke(@NotNull List<? extends AppItem> list) {
            AppItem appItem;
            AppItem appItemPrevious;
            AppItem appItem2 = this.a;
            ListIterator<? extends AppItem> listIterator = list.listIterator(list.size());
            do {
                appItem = null;
                if (!listIterator.hasPrevious()) {
                    appItemPrevious = null;
                    break;
                }
                appItemPrevious = listIterator.previous();
            } while (!(appItemPrevious.getParentType() == appItem2.getParentType()));
            AppItem appItem3 = appItemPrevious;
            if (appItem3 == null) {
                ListIterator<? extends AppItem> listIterator2 = list.listIterator(list.size());
                while (listIterator2.hasPrevious()) {
                    AppItem appItemPrevious2 = listIterator2.previous();
                    if (appItemPrevious2.isEnable()) {
                        appItem = appItemPrevious2;
                        break;
                    }
                }
                appItem3 = appItem;
            }
            int iIndexOf = appItem3 != null ? list.indexOf(appItem3) + 1 : 0;
            return new AppItem(this.a.getParentType(), this.a.getType(), iIndexOf, iIndexOf > 0 ? list.get(iIndexOf - 1).isEnable() : true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "list", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<? extends AppItem>, AppItem> {
        public final /* synthetic */ AppItem a;
        public final /* synthetic */ List<AppGroup> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppItem appItem, List<AppGroup> list) {
            super(1);
            this.a = appItem;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppItem invoke(@NotNull List<? extends AppItem> list) {
            AppGroup appGroup;
            Object next;
            Object obj;
            int i;
            int i2 = 0;
            if (!this.a.isEnable()) {
                return new AppItem(-1, this.a.getType(), list.size(), false);
            }
            List<AppGroup> list2 = this.b;
            AppItem appItem = this.a;
            Iterator<T> it2 = list2.iterator();
            do {
                appGroup = null;
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((AppGroup) next).getGroup() == appItem.getParentType()));
            AppGroup appGroup2 = (AppGroup) next;
            if (appGroup2 != null) {
                List<AppGroup> list3 = this.b;
                for (Object obj2 : list3.subList(list3.indexOf(appGroup2), list3.size())) {
                    AppGroup appGroup3 = (AppGroup) obj2;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        for (AppItem appItem2 : list) {
                            if ((appItem2.isEnable() && appItem2.getParentType() == appGroup3.getGroup()) && (i = i + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    if (i < appGroup3.getMax()) {
                        obj = obj2;
                        break;
                    }
                }
                appGroup = (AppGroup) obj;
            }
            if (appGroup == null) {
                return new AppItem(-1, this.a.getType(), list.size(), false);
            }
            List<AppGroup> list4 = this.b;
            List<AppGroup> listSubList = list4.subList(0, list4.indexOf(appGroup) + 1);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubList, 10));
            Iterator<T> it3 = listSubList.iterator();
            while (it3.hasNext()) {
                arrayList.add(Integer.valueOf(((AppGroup) it3.next()).getGroup()));
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    if (arrayList.contains(Integer.valueOf(((AppItem) it4.next()).getParentType())) && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            return new AppItem(appGroup.getGroup(), this.a.getType(), i2, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "list", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<List<AppItem>, Unit> {
        public final /* synthetic */ Map<Integer, Integer> a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Boolean> {
            public final /* synthetic */ List<AppItem> a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ List<Integer> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<AppItem> list, int i, int i2, List<Integer> list2) {
                super(0);
                this.a = list;
                this.b = i;
                this.c = i2;
                this.d = list2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                int i;
                int i2;
                List<AppItem> list = this.a;
                int i3 = this.c;
                List<Integer> list2 = this.d;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (AppItem appItem : list) {
                        if ((appItem.isEnable() && appItem.getParentType() == i3 && list2.contains(Integer.valueOf(appItem.getType()))) && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                List<AppItem> list3 = this.a;
                int i4 = this.c;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (AppItem appItem2 : list3) {
                        if ((appItem2.isEnable() && appItem2.getParentType() == i4) && (i2 = i2 + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                return i2 > this.b && i2 - i > 0;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "it", "", com.google.android.exoplayer2.text.ttml.b.c0, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<AppItem, Boolean, Unit> {
            public final /* synthetic */ List<AppItem> a;
            public final /* synthetic */ Map<Integer, Integer> b;
            public final /* synthetic */ int c;
            public final /* synthetic */ Function0<Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<AppItem> list, Map<Integer, Integer> map, int i, Function0<Unit> function0) {
                super(2);
                this.a = list;
                this.b = map;
                this.c = i;
                this.d = function0;
            }

            public final void a(@NotNull AppItem appItem, boolean z) {
                int parentType = appItem.getParentType();
                if (AppMergeKt.a(this.a, parentType, this.b) && parentType != this.c) {
                    this.d.invoke();
                } else {
                    int iIndexOf = z ? this.a.indexOf(appItem) : this.a.indexOf(appItem) + 1;
                    this.a.add(iIndexOf, new AppItem(parentType, 49, iIndexOf, true));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(AppItem appItem, Boolean bool) {
                a(appItem, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.appsort.merge.AppMergeKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0840c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ List<AppItem> a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0840c(List<AppItem> list, int i, int i2) {
                super(0);
                this.a = list;
                this.b = i;
                this.c = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object obj;
                Object next;
                AppItem appItem;
                List<AppItem> list = this.a;
                int i = this.c;
                Iterator<T> it2 = list.iterator();
                do {
                    obj = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        appItem = (AppItem) next;
                    }
                } while (!(appItem.getType() == i || appItem.getParentType() == i));
                AppItem appItem2 = (AppItem) next;
                if (appItem2 != null) {
                    if (appItem2.getType() == this.c) {
                        int iIndexOf = this.a.indexOf(appItem2) + 1;
                        this.a.add(iIndexOf, new AppItem(this.c, 49, iIndexOf, true));
                        return;
                    } else {
                        int iIndexOf2 = this.a.indexOf(appItem2);
                        this.a.add(iIndexOf2, new AppItem(this.c, 49, iIndexOf2, true));
                        return;
                    }
                }
                for (Object obj2 : this.a) {
                    if (!((AppItem) obj2).isEnable()) {
                        obj = obj2;
                        break;
                    }
                }
                AppItem appItem3 = (AppItem) obj;
                if (appItem3 == null) {
                    List<AppItem> list2 = this.a;
                    list2.add(list2.size(), new AppItem(this.b, this.c, this.a.size(), true));
                    List<AppItem> list3 = this.a;
                    list3.add(list3.size(), new AppItem(this.c, 49, this.a.size(), true));
                    return;
                }
                int iIndexOf3 = this.a.indexOf(appItem3);
                this.a.add(iIndexOf3, new AppItem(this.b, this.c, iIndexOf3, true));
                int iIndexOf4 = this.a.indexOf(appItem3);
                this.a.add(iIndexOf4, new AppItem(this.c, 49, iIndexOf4, true));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<Integer, Integer> map, int i, int i2) {
            super(1);
            this.a = map;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<AppItem> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<AppItem> list) {
            AppItem appItemPrevious;
            AppItem appItem;
            AppItem appItem2 = null;
            AppItem appItem3 = null;
            for (AppItem appItem4 : list) {
                if (appItem2 != null && appItem3 != null) {
                    break;
                }
                if (appItem4.getType() == 17) {
                    appItem2 = appItem4;
                } else if (appItem4.getType() == 19) {
                    appItem3 = appItem4;
                }
            }
            C0840c c0840c = new C0840c(list, this.c, this.b);
            b bVar = new b(list, this.a, this.b, c0840c);
            if (appItem2 != null && appItem2.isEnable()) {
                bVar.invoke(appItem2, Boolean.FALSE);
            } else if (appItem3 != null) {
                bVar.invoke(appItem3, Boolean.TRUE);
            } else {
                c0840c.invoke();
            }
            Integer num = this.a.get(Integer.valueOf(this.b));
            int iIntValue = num == null ? 999 : num.intValue();
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{19, 49, 17});
            a aVar = new a(list, iIntValue, this.b, listListOf);
            while (aVar.invoke().booleanValue()) {
                int i = this.b;
                ListIterator<AppItem> listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        appItemPrevious = null;
                        break;
                    } else {
                        appItemPrevious = listIterator.previous();
                        appItem = appItemPrevious;
                    }
                } while (!(appItem.isEnable() && appItem.getParentType() == i && !listListOf.contains(Integer.valueOf(appItem.getType()))));
                AppItem appItem5 = appItemPrevious;
                if (appItem5 == null) {
                    return;
                }
                Boolean boolValueOf = Boolean.valueOf(list.remove(appItem5));
                if (!boolValueOf.booleanValue()) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    boolValueOf.booleanValue();
                    Iterator<AppItem> it2 = list.iterator();
                    int size = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            size = -1;
                            break;
                        } else if (!it2.next().isEnable()) {
                            break;
                        } else {
                            size++;
                        }
                    }
                    if (size < 0) {
                        size = list.size();
                    }
                    appItem5.setIndex(size);
                    appItem5.setEnable(false);
                    list.add(appItem5.getIndex(), appItem5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.appsort.merge.AppMergeKt$merge$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "list", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function1<List<AppItem>, Unit> {
        public final /* synthetic */ Function1<List<? extends AppItem>, AppItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super List<? extends AppItem>, ? extends AppItem> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<AppItem> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<AppItem> list) {
            AppItem appItemInvoke = this.a.invoke(list);
            list.add(appItemInvoke.getIndex(), appItemInvoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends AppItem> boolean a(List<? extends T> list, int i, Map<Integer, Integer> map) {
        int i2;
        Integer num = map.get(Integer.valueOf(i));
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                AppItem appItem = (AppItem) it2.next();
                if ((appItem.isEnable() && appItem.getParentType() == i) && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2 >= iIntValue;
    }

    @NotNull
    public static final Function1<List<? extends AppItem>, AppItem> getAppendItem(@NotNull AppItem appItem) {
        return new a(appItem);
    }

    @NotNull
    public static final Function1<List<AppItem>, Unit> merge(@NotNull AppItem appItem) {
        return new AnonymousClass1(getAppendItem(appItem));
    }

    @NotNull
    public static final Function1<List<AppItem>, Unit> mergeWxPay(@NotNull Map<Integer, Integer> map, int i, int i2) {
        return new c(map, i2, i);
    }

    public static /* synthetic */ Function1 mergeWxPay$default(Map map, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = r.emptyMap();
        }
        if ((i3 & 2) != 0) {
            i = 255;
        }
        if ((i3 & 4) != 0) {
            i2 = 7;
        }
        return mergeWxPay(map, i, i2);
    }

    @NotNull
    public static final Function1<List<? extends AppItem>, AppItem> getAppendItem(@NotNull AppItem appItem, @NotNull List<AppGroup> list) {
        return new b(appItem, list);
    }

    @NotNull
    public static final Function1<List<AppItem>, Unit> merge(@NotNull Function1<? super List<? extends AppItem>, ? extends AppItem> function1) {
        return new AnonymousClass1(function1);
    }
}
