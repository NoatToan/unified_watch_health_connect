package com.airoha.android.lib.mmi.stage;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStageReloadNv extends MmiStage {
    public short mNvkeyId;

    public MmiStageReloadNv(AirohaMmiMgr airohaMmiMgr, short s) {
        super(airohaMmiMgr);
        this.mNvkeyId = s;
        this.mRaceId = RaceId.RACE_RELOAD_NVKEY_TO_RAM;
        this.mRaceRespType = RaceType.RESPONSE;
    }

    @Override // com.airoha.android.lib.mmi.stage.MmiStage
    public void genRacePackets() {
        RacePacket racePacket = new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_RELOAD_NVKEY_TO_RAM, Converter.ShortToBytes(this.mNvkeyId));
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
        sb.append("MmiStageReloadNv ");
        sb.append(this.mIsRelay ? "Relay" : "");
        sb.append(" resp status: ");
        sb.append((int) b);
        airohaLink.logToFile(str, sb.toString());
        RacePacket racePacket = this.mCmdPacketMap.get(this.TAG);
        if (b == 0) {
            this.mMmiMgr.notifyReloadNv(this.mIsRelay ? (byte) 1 : (byte) 0, b);
            racePacket.setIsRespStatusSuccess();
        }
    }
}
