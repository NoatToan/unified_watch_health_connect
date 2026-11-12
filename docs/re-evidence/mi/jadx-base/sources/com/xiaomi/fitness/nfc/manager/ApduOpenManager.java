package com.xiaomi.fitness.nfc.manager;

import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.util.Constants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import defpackage.vqg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ'\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u000e2\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J-\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/manager/ApduOpenManager;", "", "<init>", "()V", "terminal", "Lcom/tsmclient/smartcard/terminal/IScTerminal;", "getTerminal", "()Lcom/tsmclient/smartcard/terminal/IScTerminal;", "setTerminal", "(Lcom/tsmclient/smartcard/terminal/IScTerminal;)V", "open", "", Constants.EXTRA_CLOSE_TAI, "execute", "Lkotlin/collections/ArrayList;", "", "Ljava/util/ArrayList;", "apduCommand", "Lcom/xiaomi/fitness/nfc/manager/APDUOpenCommand;", "(Lcom/xiaomi/fitness/nfc/manager/APDUOpenCommand;)Ljava/util/ArrayList;", "innerExecute", "(Lcom/xiaomi/fitness/nfc/manager/APDUOpenCommand;Lcom/tsmclient/smartcard/terminal/IScTerminal;)Ljava/util/ArrayList;", "executeCapdu", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApduOpenManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApduOpenManager.kt\ncom/xiaomi/fitness/nfc/manager/ApduOpenManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1872#2,3:93\n*S KotlinDebug\n*F\n+ 1 ApduOpenManager.kt\ncom/xiaomi/fitness/nfc/manager/ApduOpenManager\n*L\n66#1:93,3\n*E\n"})
public final class ApduOpenManager {

    @NotNull
    public static final ApduOpenManager INSTANCE = new ApduOpenManager();

    @Nullable
    private static IScTerminal terminal;

    private ApduOpenManager() {
    }

    private final ArrayList<String> executeCapdu(APDUOpenCommand apduCommand, IScTerminal terminal2) throws InterruptedException, IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        for (Object obj : apduCommand.getCommands()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            vqg.b("ApduOpenManager executeCapdu capdu index:" + i + " count:" + str.length() + " " + str + " ");
            ScResponse scResponseTransmit = terminal2.transmit(Coder.hexStringToBytes(str));
            Intrinsics.checkNotNullExpressionValue(scResponseTransmit, "transmit(...)");
            if (apduCommand.getIsExpectCmd()) {
                String strBytesToHexString = Coder.bytesToHexString(scResponseTransmit.getStatus().toBytes());
                arrayList.add(Coder.bytesToHexString(scResponseTransmit.toBytes()));
                if (apduCommand.getExpectCommands() == null) {
                    throw new IllegalArgumentException("ApduOpenManager executeCapdu apduCommand.expectCommands is null");
                }
                String str2 = apduCommand.getExpectCommands().get(i);
                Pattern patternCompile = Pattern.compile(str2);
                Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strBytesToHexString);
                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                vqg.b("ApduOpenManager executeCapdu  response:" + strBytesToHexString);
                if (!matcher.matches()) {
                    vqg.b("ApduOpenManager executeCapdu  not match response:" + strBytesToHexString + " exepectCmd:" + str2 + " index:" + i);
                    return arrayList;
                }
            } else {
                arrayList.add(Coder.bytesToHexString(scResponseTransmit.toBytes()));
            }
            i = i2;
        }
        return arrayList;
    }

    private final ArrayList<String> innerExecute(APDUOpenCommand apduCommand, IScTerminal terminal2) {
        return executeCapdu(apduCommand, terminal2);
    }

    public final boolean close() {
        try {
            IScTerminal iScTerminal = terminal;
            if (iScTerminal != null) {
                iScTerminal.close();
            }
            vqg.d("ApduOpenManager close success");
            return true;
        } catch (Exception e) {
            vqg.c("ApduOpenManager close error", e);
            terminal = null;
            return false;
        }
    }

    @Nullable
    public final ArrayList<String> execute(@NotNull APDUOpenCommand apduCommand) {
        Intrinsics.checkNotNullParameter(apduCommand, "apduCommand");
        try {
            IScTerminal iScTerminal = terminal;
            Intrinsics.checkNotNull(iScTerminal);
            return innerExecute(apduCommand, iScTerminal);
        } catch (Exception e) {
            vqg.c("ApduOpenManager executeCapdu error", e);
            return null;
        }
    }

    @Nullable
    public final IScTerminal getTerminal() {
        return terminal;
    }

    public final boolean open() {
        try {
            CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null);
            Intrinsics.checkNotNullExpressionValue(cardInfoMakeCardInfo, "makeCardInfo(...)");
            IScTerminal terminal2 = cardInfoMakeCardInfo.getTerminal();
            terminal = terminal2;
            if (terminal2 != null) {
                terminal2.open();
            }
            vqg.d("ApduOpenManager open success");
            return true;
        } catch (Exception e) {
            vqg.c("ApduOpenManager open error", e);
            return false;
        }
    }

    public final void setTerminal(@Nullable IScTerminal iScTerminal) {
        terminal = iScTerminal;
    }
}
