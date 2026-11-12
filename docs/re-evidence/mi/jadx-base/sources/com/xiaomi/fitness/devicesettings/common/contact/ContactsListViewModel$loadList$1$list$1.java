package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.contact.ContactsListViewModel$loadList$1$list$1", f = "ContactsListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nContactsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactsListViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel$loadList$1$list$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1#2:147\n1863#3:148\n1863#3,2:149\n1864#3:151\n1863#3,2:152\n1010#3,2:154\n*S KotlinDebug\n*F\n+ 1 ContactsListViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel$loadList$1$list$1\n*L\n76#1:148\n77#1:149,2\n76#1:151\n81#1:152,2\n84#1:154,2\n*E\n"})
public final class ContactsListViewModel$loadList$1$list$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<ContactBean>>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ ContactsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsListViewModel$loadList$1$list$1(Context context, ContactsListViewModel contactsListViewModel, Continuation<? super ContactsListViewModel$loadList$1$list$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = contactsListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactsListViewModel$loadList$1$list$1(this.$context, this.this$0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList<ContactBean> arrayList = new ArrayList();
        HashMap map = new HashMap();
        Cursor cursorQuery = this.$context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"contact_id", "data1", "display_name"}, null, null, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("contact_id"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? string3 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
            objectRef.element = string3;
            if (string3 != 0) {
                ?? Replace$default = StringsKt__StringsJVMKt.replace$default((String) string3, "-", "", false, 4, (Object) null);
                objectRef.element = Replace$default;
                objectRef.element = StringsKt__StringsJVMKt.replace$default((String) Replace$default, " ", "", false, 4, (Object) null);
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty((CharSequence) objectRef.element)) {
                    List arrayList2 = (List) map.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    Iterator it = arrayList2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((ContactBean) next).getPhone(), objectRef.element));
                    if (next == null) {
                        Intrinsics.checkNotNull(string2);
                        arrayList2.add(new ContactBean(string2, (String) objectRef.element));
                    }
                    map.put(string, arrayList2);
                }
            }
        }
        Logger.i(ContactsListViewModel.sTag, "cursor!!.moveToNext() end");
        cursorQuery.close();
        Set setEntrySet = map.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Iterator it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            Iterator it3 = ((Iterable) value).iterator();
            while (it3.hasNext()) {
                arrayList.add((ContactBean) it3.next());
            }
        }
        for (ContactBean contactBean : arrayList) {
            String strD = zwh.d(contactBean.getName());
            Intrinsics.checkNotNullExpressionValue(strD, "getPinyin(...)");
            String upperCase = strD.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            contactBean.setPinyin(upperCase);
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListViewModel$loadList$1$list$1$invokeSuspend$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((ContactBean) t).getPinyin(), ((ContactBean) t2).getPinyin());
                }
            });
        }
        this.this$0.initLetterInDexs(arrayList);
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<ContactBean>> continuation) {
        return ((ContactsListViewModel$loadList$1$list$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
