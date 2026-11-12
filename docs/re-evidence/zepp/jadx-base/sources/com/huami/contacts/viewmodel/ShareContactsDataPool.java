package com.huami.contacts.viewmodel;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.github.tamir7.contacts.Contact;
import com.github.tamir7.contacts.PhoneNumber;
import com.huami.contacts.bean.ContactDecorator;
import com.huami.contacts.bean.PhoneContact;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\tR\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "", "", "Lcom/github/tamir7/contacts/Contact;", "contacts", "Lcom/huami/contacts/bean/ContactDecorator;", "a", "Lcom/huami/contacts/viewmodel/PhoneContactRepo;", CommonLanguageSettingFragment.KEY_REPO, "", PointCategory.INIT, "(Lcom/huami/contacts/viewmodel/PhoneContactRepo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAllContacts", "", "searchStr", "search", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectedContact", "", "select", "allowSelect", "deInit", "", LogUtil.I, "getCountLimit", "()I", "setCountLimit", "(I)V", "countLimit", "b", "Ljava/util/List;", "allContacts", "c", "searchContacts", "<init>", "()V", "Companion", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class ShareContactsDataPool {
    private static ShareContactsDataPool d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int countLimit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<ContactDecorator> allContacts;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<ContactDecorator> searchContacts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Character> e = CollectionsKt___CollectionsKt.plus(new CharRange('A', 'Z'), '#');
    private static final char f = '#';
    private static final int g = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/contacts/viewmodel/ShareContactsDataPool$Companion;", "", "Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "getInstance", "", "", "GROUP_INDEX", "Ljava/util/List;", "getGROUP_INDEX", "()Ljava/util/List;", "", "NO_LIMIT_COUNT", LogUtil.I, "getNO_LIMIT_COUNT", "()I", "UNKNOWN_INDEX", "C", "singleton", "Lcom/huami/contacts/viewmodel/ShareContactsDataPool;", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final List<Character> getGROUP_INDEX() {
            return ShareContactsDataPool.e;
        }

        @NotNull
        public final synchronized ShareContactsDataPool getInstance() {
            ShareContactsDataPool shareContactsDataPool;
            shareContactsDataPool = ShareContactsDataPool.d;
            if (shareContactsDataPool == null) {
                shareContactsDataPool = new ShareContactsDataPool(null);
                ShareContactsDataPool.d = shareContactsDataPool;
            }
            return shareContactsDataPool;
        }

        public final int getNO_LIMIT_COUNT() {
            return ShareContactsDataPool.g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@"}, d2 = {"Lcom/huami/contacts/viewmodel/PhoneContactRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlin/coroutines/Continuation;", "", "continuation", "", PointCategory.INIT}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.contacts.viewmodel.ShareContactsDataPool", f = "ShareContactsDataPool.kt", i = {0}, l = {33}, m = PointCategory.INIT, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ShareContactsDataPool.this.init(null, this);
        }
    }

    private ShareContactsDataPool() {
        this.countLimit = g;
        this.allContacts = new ArrayList();
        this.searchContacts = new ArrayList();
    }

    private final List<ContactDecorator> a(List<Contact> contacts) {
        ArrayList arrayList = new ArrayList();
        for (Contact contact : contacts) {
            String displayName = contact.getDisplayName();
            List<PhoneNumber> phoneNumbers = contact.getPhoneNumbers();
            if (!(displayName == null || displayName.length() == 0)) {
                if (!(phoneNumbers == null || phoneNumbers.isEmpty())) {
                    Iterator<T> it2 = phoneNumbers.iterator();
                    while (it2.hasNext()) {
                        String number = ((PhoneNumber) it2.next()).getNumber();
                        if (!(number == null || number.length() == 0)) {
                            String toPinyin = CharacterParser.INSTANCE.parseToPinyin(displayName);
                            if (Intrinsics.areEqual(toPinyin, displayName)) {
                                toPinyin = String.valueOf(f);
                            }
                            if (!e.contains(Character.valueOf(StringsKt___StringsKt.first(toPinyin)))) {
                                toPinyin = String.valueOf(f);
                            }
                            arrayList.add(new ContactDecorator(new PhoneContact(displayName, new Regex("\\s").replace(number, ""), toPinyin), false, 2, null));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean allowSelect(boolean select) {
        return !select || this.countLimit == g || getSelectedContact().size() < this.countLimit;
    }

    public final void deInit() {
        d = null;
        this.allContacts.clear();
        this.searchContacts.clear();
    }

    @NotNull
    public final List<ContactDecorator> getAllContacts() {
        return this.allContacts;
    }

    public final int getCountLimit() {
        return this.countLimit;
    }

    @NotNull
    public final List<ContactDecorator> getSelectedContact() {
        List<ContactDecorator> list = this.allContacts;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ContactDecorator) obj).isSelect()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object init(@NotNull PhoneContactRepo phoneContactRepo, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        ShareContactsDataPool shareContactsDataPool;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objLoadAllContacts = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadAllContacts);
            aVar.d = this;
            aVar.b = 1;
            objLoadAllContacts = phoneContactRepo.loadAllContacts(aVar);
            if (objLoadAllContacts == coroutine_suspended) {
                return coroutine_suspended;
            }
            shareContactsDataPool = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shareContactsDataPool = (ShareContactsDataPool) aVar.d;
            ResultKt.throwOnFailure(objLoadAllContacts);
        }
        List<ContactDecorator> listA = shareContactsDataPool.a((List) objLoadAllContacts);
        shareContactsDataPool.allContacts.clear();
        shareContactsDataPool.allContacts.addAll(listA);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object search(@NotNull String str, @NotNull Continuation<? super List<ContactDecorator>> continuation) {
        this.searchContacts.clear();
        if (str.length() == 0) {
            return this.searchContacts;
        }
        List<ContactDecorator> list = this.allContacts;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PhoneContact phoneContact = ((ContactDecorator) obj).getPhoneContact();
            if (Boxing.boxBoolean(StringsKt__StringsKt.contains$default((CharSequence) phoneContact.getDisPlayName(), (CharSequence) str, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) phoneContact.getPhoneNum(), (CharSequence) str, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) phoneContact.getDisPlayNamePinyin(), (CharSequence) str, false, 2, (Object) null)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        this.searchContacts.addAll(arrayList);
        return this.searchContacts;
    }

    public final void setCountLimit(int i) {
        this.countLimit = i;
    }

    public /* synthetic */ ShareContactsDataPool(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
