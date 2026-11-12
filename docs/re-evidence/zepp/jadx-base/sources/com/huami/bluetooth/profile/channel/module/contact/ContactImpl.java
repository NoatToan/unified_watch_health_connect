package com.huami.bluetooth.profile.channel.module.contact;

import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.binary.BinaryEncoder;
import com.huami.bluetooth.profile.channel.module.contact.bean.Contact;
import com.huami.bluetooth.profile.channel.module.contact.bean.ContactDto;
import com.huami.bluetooth.profile.channel.module.contact.bean.VersionInfo;
import com.huami.bluetooth.profile.channel.module.contact.bean.VersionInfoDto;
import com.huami.bluetooth.profile.channel.module.contact.request.BtCmd;
import com.huami.bluetooth.profile.channel.module.contact.request.BtRequest;
import com.huami.bluetooth.profile.channel.module.contact.request.BtResponse;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ByteSpreadBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\bR\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/ContactImpl;", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "interceptor", "", "setInterceptor", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/VersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "addContacts", "([Lcom/huami/bluetooth/profile/channel/module/contact/bean/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "", "contacts", "setContact", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContacts", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ContactImpl implements ContactApi {

    @NotNull
    private static final String b = "ContactImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ContactModule module;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactImpl", f = "ContactImpl.kt", i = {}, l = {40}, m = "addContacts", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ContactImpl.this.addContacts(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactImpl", f = "ContactImpl.kt", i = {}, l = {51}, m = "deleteContact", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ContactImpl.this.deleteContact(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactImpl", f = "ContactImpl.kt", i = {}, l = {75}, m = "getAllContacts", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ContactImpl.this.getAllContacts(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactImpl", f = "ContactImpl.kt", i = {}, l = {29}, m = "queryVersion", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ContactImpl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactImpl", f = "ContactImpl.kt", i = {}, l = {65}, m = "setContact", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ContactImpl.this.setContact(null, this);
        }
    }

    public ContactImpl(@NotNull ContactModule contactModule) {
        this.module = contactModule;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.contact.ContactApi
    @Nullable
    public Object addContacts(@NotNull Contact[] contactArr, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objSendRequest = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            ArrayList arrayList = new ArrayList(contactArr.length);
            for (Contact contact : contactArr) {
                arrayList.add(ContactDto.INSTANCE.fromContact(contact));
            }
            ContactModule contactModule = this.module;
            BtRequest btRequest = new BtRequest(new BtCmd(3, 0, 2, null), 4, arrayList);
            aVar.c = 1;
            objSendRequest = contactModule.sendRequest(btRequest, aVar);
            if (objSendRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendRequest);
        }
        BtResponse btResponse = (BtResponse) objSendRequest;
        if (!btResponse.getOpResult() || btResponse.getData() == null) {
            return Boxing.boxBoolean(false);
        }
        byte b2 = btResponse.getData()[1];
        Debug.fi(b, Intrinsics.stringPlus("add contacts result: ", Boxing.boxByte(b2)));
        return Boxing.boxBoolean(b2 == 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.contact.ContactApi
    @Nullable
    public Object deleteContact(@NotNull Contact[] contactArr, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendRequest = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            ArrayList arrayList = new ArrayList(contactArr.length);
            for (Contact contact : contactArr) {
                arrayList.add(ContactDto.INSTANCE.fromContact(contact));
            }
            ContactModule contactModule = this.module;
            BtRequest btRequest = new BtRequest(new BtCmd(5, 0, 2, null), 6, arrayList);
            bVar.c = 1;
            objSendRequest = contactModule.sendRequest(btRequest, bVar);
            if (objSendRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendRequest);
        }
        BtResponse btResponse = (BtResponse) objSendRequest;
        if (!btResponse.getOpResult() || btResponse.getData() == null) {
            return Boxing.boxBoolean(false);
        }
        byte b2 = btResponse.getData()[1];
        Debug.fi(b, Intrinsics.stringPlus("delete contact result: ", Boxing.boxByte(b2)));
        return Boxing.boxBoolean(b2 == 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.contact.ContactApi
    @Nullable
    public Object getAllContacts(@NotNull Continuation<? super List<Contact>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objSendRequest = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        int i3 = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            ContactModule contactModule = this.module;
            BtRequest btRequest = new BtRequest(new BtCmd(9, 0, 2, null), 10, null, 4, null);
            cVar.c = 1;
            objSendRequest = contactModule.sendRequest(btRequest, cVar);
            if (objSendRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendRequest);
        }
        BtResponse btResponse = (BtResponse) objSendRequest;
        if (!btResponse.getOpResult()) {
            return null;
        }
        byte[] data = btResponse.getData();
        if (data == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iBytesToInt = GattUtils.bytesToInt(data, 1, 2);
        ArrayList arrayList = new ArrayList();
        List strings$default = ByteArrayKt.toStrings$default(data, 3, 0, false, 6, null);
        Debug.fi(b, "count is: " + iBytesToInt + "; allContact is: " + strings$default);
        if (iBytesToInt * 2 != strings$default.size()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strings$default.size() - 2, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                int i4 = i3 + 2;
                arrayList.add(new Contact((String) strings$default.get(i3), (String) strings$default.get(i3 + 1)));
                if (i3 == progressionLastElement) {
                    break;
                }
                i3 = i4;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.contact.ContactApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super VersionInfo> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objSendRequest = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            ContactModule contactModule = this.module;
            BtRequest btRequest = new BtRequest(new BtCmd(1, 0, 2, null), 2, null, 4, null);
            dVar.c = 1;
            objSendRequest = contactModule.sendRequest(btRequest, dVar);
            if (objSendRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendRequest);
        }
        BtResponse btResponse = (BtResponse) objSendRequest;
        if (!btResponse.getOpResult()) {
            return new VersionInfo(0, 0, 0, 7, null);
        }
        VersionInfoDto versionInfoDto = new VersionInfoDto(null, null, null, 7, null);
        BinaryDecoder.decode(versionInfoDto, btResponse.getData());
        return versionInfoDto.toVersionInfo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.contact.ContactApi
    @Nullable
    public Object setContact(@NotNull List<Contact> list, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objSendRequest = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(ContactDto.INSTANCE.fromContact((Contact) it2.next()));
            }
            byte[] bArrEncode = new BinaryEncoder().encode(arrayList);
            long size = arrayList.size();
            ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(2);
            byteSpreadBuilder.addSpread(GattUtils.numberToBytes(size, 2));
            byteSpreadBuilder.addSpread(bArrEncode);
            byte[] array = byteSpreadBuilder.toArray();
            ContactModule contactModule = this.module;
            BtRequest btRequest = new BtRequest(new BtCmd(7, 0, 2, null), 8, array);
            eVar.c = 1;
            objSendRequest = contactModule.sendRequest(btRequest, eVar);
            if (objSendRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendRequest);
        }
        BtResponse btResponse = (BtResponse) objSendRequest;
        if (!btResponse.getOpResult() || btResponse.getData() == null) {
            return Boxing.boxBoolean(false);
        }
        byte b2 = btResponse.getData()[1];
        Debug.fi(b, Intrinsics.stringPlus("set contact result: ", Boxing.boxByte(b2)));
        return Boxing.boxBoolean(b2 == 1);
    }

    @Override // com.huami.bluetooth.profile.channel.module.contact.ContactApi
    public void setInterceptor(@NotNull DataTransferCallback interceptor) {
        this.module.setInterceptor(interceptor);
    }
}
