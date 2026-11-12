package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00170\u001bJ(\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00072\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001e\u0012\u0004\u0012\u00020\u00170\u001bJ\u0014\u0010\u001f\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001eJ\u000e\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0007R<\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "letterIndexes", "Lkotlin/collections/HashMap;", "", "", "Ljava/util/HashMap;", "getLetterIndexes", "()Ljava/util/HashMap;", "setLetterIndexes", "(Ljava/util/HashMap;)V", "Ljava/util/HashMap;", "allList", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "getAllList", "()Ljava/util/List;", "setAllList", "(Ljava/util/List;)V", "loadList", "", "context", "Landroid/content/Context;", "success", "Lkotlin/Function1;", "filterByKey", "key", "", "initLetterInDexs", "list", "getLetterPosition", "letter", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContactsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactsListViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n774#2:147\n865#2,2:148\n*S KotlinDebug\n*F\n+ 1 ContactsListViewModel.kt\ncom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel\n*L\n101#1:147\n101#1:148,2\n*E\n"})
public final class ContactsListViewModel extends BaseViewModel<BaseModel> {

    @NotNull
    public static final String sTag = "ContactsListViewModel";

    @NotNull
    private List<ContactBean> allList = new ArrayList();

    @Nullable
    private HashMap<String, Integer> letterIndexes;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.contact.ContactsListViewModel$loadList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.contact.ContactsListViewModel$loadList$1", f = "ContactsListViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<List<ContactBean>, Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super List<ContactBean>, Unit> function1, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function1;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactsListViewModel.this.new AnonymousClass1(this.$success, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ContactsListViewModel$loadList$1$list$1 contactsListViewModel$loadList$1$list$1 = new ContactsListViewModel$loadList$1$list$1(this.$context, ContactsListViewModel.this, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, contactsListViewModel$loadList$1$list$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<ContactBean> list = (List) obj;
            ContactsListViewModel.this.setAllList(list);
            this.$success.invoke2(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void filterByKey(@NotNull String key, @NotNull Function1<? super List<ContactBean>, Unit> success) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(success, "success");
        List<ContactBean> list = this.allList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ContactBean contactBean = (ContactBean) obj;
            if (StringsKt__StringsKt.contains((CharSequence) contactBean.getName(), (CharSequence) key, true) || StringsKt__StringsKt.contains((CharSequence) contactBean.getPhone(), (CharSequence) key, true)) {
                arrayList.add(obj);
            }
        }
        initLetterInDexs(arrayList);
        success.invoke2(arrayList);
    }

    @NotNull
    public final List<ContactBean> getAllList() {
        return this.allList;
    }

    @Nullable
    public final HashMap<String, Integer> getLetterIndexes() {
        return this.letterIndexes;
    }

    public final int getLetterPosition(@NotNull String letter) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        HashMap<String, Integer> map = this.letterIndexes;
        Intrinsics.checkNotNull(map);
        Integer num = map.get(letter);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final void initLetterInDexs(@NotNull List<ContactBean> list) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContactBean contactBean = list.get(i);
            String strSubstring2 = "";
            if (contactBean.getPinyin().length() > 0) {
                strSubstring = contactBean.getPinyin().substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            if (i >= 1) {
                String strC = zwh.c(list.get(i - 1).getName());
                Intrinsics.checkNotNullExpressionValue(strC, "getPingYin(...)");
                String upperCase = strC.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase.length() > 0) {
                    strSubstring2 = upperCase.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                }
            }
            if (!TextUtils.equals(strSubstring, strSubstring2)) {
                if (this.letterIndexes == null) {
                    this.letterIndexes = new HashMap<>();
                }
                Integer numValueOf = Integer.valueOf(i);
                HashMap<String, Integer> map = this.letterIndexes;
                Intrinsics.checkNotNull(map);
                String upperCase2 = strSubstring.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                map.put(upperCase2, numValueOf);
            }
        }
    }

    public final void loadList(@NotNull Context context, @NotNull Function1<? super List<ContactBean>, Unit> success) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(success, "success");
        try {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(success, context, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
            success.invoke2(this.allList);
        }
    }

    public final void setAllList(@NotNull List<ContactBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allList = list;
    }

    public final void setLetterIndexes(@Nullable HashMap<String, Integer> map) {
        this.letterIndexes = map;
    }
}
