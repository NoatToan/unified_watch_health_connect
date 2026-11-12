package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageGetVaIndex extends MmiStage {
    public MmiStageGetVaIndex(AirohaMmiMgr airohaMmiMgr) {
        super(airohaMmiMgr);
        this.mRaceId = RaceId.RACE_NVKEY_READFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArrShortToBytes = Converter.ShortToBytes((short) -3350);
        byte[] bArrShortToBytes2 = Converter.shortToBytes((short) 100);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_READFULLKEY, new byte[]{bArrShortToBytes[0], bArrShortToBytes[1], bArrShortToBytes2[0], bArrShortToBytes2[1]});
        this.mCmdPacketQueue.offer(racePacket);
        this.mCmdPacketMap.put(this.TAG, racePacket);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
        AirohaLink airohaLink = this.mAirohaLink;
        String str = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("MmiStageGetVaIndex ");
        sb.append(this.mIsRelay ? "Relay" : "");
        sb.append(" resp packet: ");
        sb.append(Converter.byte2HexStr(bArr));
        airohaLink.logToFile(str, sb.toString());
        if (i != 2560) {
            return;
        }
        short sBytesToShort = bArr.length >= 8 ? Converter.BytesToShort(bArr[7], bArr[6]) : (short) 0;
        AirohaLink airohaLink2 = this.mAirohaLink;
        String str2 = this.TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MmiStageGetVaIndex ");
        sb2.append(this.mIsRelay ? "Relay" : "");
        sb2.append(" resp length: ");
        sb2.append((int) sBytesToShort);
        airohaLink2.logToFile(str2, sb2.toString());
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (sBytesToShort == 1) {
            this.mMmiMgr.notifyGetVaIndex(this.mIsRelay ? (byte) 1 : (byte) 0, bArr[8]);
            racePacket.setIsRespStatusSuccess();
        }
    }
}
