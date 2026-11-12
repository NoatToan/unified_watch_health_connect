package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageSetKeyMap extends MmiStage {
    public byte[] mNvkeyValue;

    public MmiStageSetKeyMap(AirohaMmiMgr airohaMmiMgr, byte[] bArr) {
        super(airohaMmiMgr);
        this.mNvkeyValue = bArr;
        this.mRaceId = RaceId.RACE_NVKEY_WRITEFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        byte[] bArr = this.mNvkeyValue;
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = (byte) 231;
        bArr2[1] = (byte) 242;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_NVKEY_WRITEFULLKEY, bArr2);
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
        sb.append("MmiStageSetKeyMap ");
        sb.append(this.mIsRelay ? "Relay" : "");
        sb.append(" resp packet: ");
        sb.append(Converter.byte2HexStr(bArr));
        airohaLink.logToFile(str, sb.toString());
        if (i != 2561) {
            return;
        }
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            this.mMmiMgr.notifySetKeyMapNv(this.mIsRelay ? (byte) 1 : (byte) 0, b);
            racePacket.setIsRespStatusSuccess();
        }
    }
}
