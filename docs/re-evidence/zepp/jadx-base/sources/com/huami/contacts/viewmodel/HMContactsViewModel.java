package com.huami.contacts.viewmodel;

import android.app.Application;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.contacts.bean.ContactDecorator;
import com.huami.contacts.bean.PhoneContact;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0018\u001a\u00020\u000bH\u0014R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR1\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001f0\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/huami/contacts/viewmodel/HMContactsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "Lcom/huami/contacts/bean/ContactDecorator;", "contacts", "Ljava/util/SortedMap;", "", "a", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "", "b", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "", "limitCount", "setSelectLimit", "Ljava/util/ArrayList;", "Lcom/huami/contacts/bean/PhoneContact;", "Lkotlin/collections/ArrayList;", "getSelectedContact", "", "select", "allowSelect", "onCleared", "Lcom/huami/contacts/viewmodel/PhoneContactRepo;", "Lcom/huami/contacts/viewmodel/PhoneContactRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "dataSharePool", "", "c", "Landroidx/lifecycle/MutableLiveData;", "getContactsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "contactsLiveData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class HMContactsViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PhoneContactRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShareContactsDataPool dataSharePool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Map<Character, List<ContactDecorator>>> contactsLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.contacts.viewmodel.HMContactsViewModel$1", f = "HMContactsViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMContactsViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShareContactsDataPool shareContactsDataPool = HMContactsViewModel.this.dataSharePool;
                PhoneContactRepo phoneContactRepo = HMContactsViewModel.this.repo;
                this.a = 1;
                if (shareContactsDataPool.init(phoneContactRepo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SortedMap sortedMapA = HMContactsViewModel.this.a(HMContactsViewModel.this.dataSharePool.getAllContacts());
            HMContactsViewModel hMContactsViewModel = HMContactsViewModel.this;
            hMContactsViewModel.b(hMContactsViewModel.getContactsLiveData(), sortedMapA);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "char1", "char2", "", "a", "(Ljava/lang/Character;Ljava/lang/Character;)I"}, k = 3, mv = {1, 4, 1})
    public static final class b<T> implements Comparator<Character> {
        public static final b a = new b();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(Character ch, Character ch2) {
            ShareContactsDataPool.Companion companion = ShareContactsDataPool.INSTANCE;
            return companion.getGROUP_INDEX().indexOf(ch) - companion.getGROUP_INDEX().indexOf(ch2);
        }
    }

    public HMContactsViewModel(@NotNull Application application) {
        super(application);
        this.repo = new PhoneContactRepo(application);
        this.dataSharePool = ShareContactsDataPool.INSTANCE.getInstance();
        this.contactsLiveData = new MutableLiveData<>();
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SortedMap<Character, List<ContactDecorator>> a(List<ContactDecorator> contacts) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : contacts) {
            Character chValueOf = Character.valueOf(StringsKt___StringsKt.first(((ContactDecorator) obj).getPhoneContact().getDisPlayNamePinyin()));
            Object arrayList = linkedHashMap.get(chValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(chValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return q.toSortedMap(linkedHashMap, b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void b(MutableLiveData<T> mutableLiveData, T t) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }

    public final boolean allowSelect(boolean select) {
        return this.dataSharePool.allowSelect(select);
    }

    @NotNull
    public final MutableLiveData<Map<Character, List<ContactDecorator>>> getContactsLiveData() {
        return this.contactsLiveData;
    }

    @NotNull
    public final ArrayList<PhoneContact> getSelectedContact() {
        List<ContactDecorator> selectedContact = this.dataSharePool.getSelectedContact();
        ArrayList<PhoneContact> arrayList = new ArrayList<>();
        Iterator<T> it2 = selectedContact.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ContactDecorator) it2.next()).getPhoneContact());
        }
        return arrayList;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.dataSharePool.deInit();
    }

    public final void setSelectLimit(int limitCount) {
        this.dataSharePool.setCountLimit(limitCount);
    }
}
