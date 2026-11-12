package org.cybergarage.upnp.std.av.renderer;

import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.StateVariable;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.util.Mutex;

/* JADX INFO: loaded from: classes23.dex */
public class AVTransport implements ActionListener, QueryListener {
    public static final String ABSCOUNT = "AbsCount";
    public static final String ABSOLUTECOUNTERPOSITION = "AbsoluteCounterPosition";
    public static final String ABSOLUTETIMEPOSITION = "AbsoluteTimePosition";
    public static final String ABSTIME = "AbsTime";
    public static final String ACTIONS = "Actions";
    public static final String AVTRANSPORTURI = "AVTransportURI";
    public static final String AVTRANSPORTURIMETADATA = "AVTransportURIMetaData";
    public static final String CURRENTMEDIADURATION = "CurrentMediaDuration";
    public static final String CURRENTPLAYMODE = "CurrentPlayMode";
    public static final String CURRENTRECORDQUALITYMODE = "CurrentRecordQualityMode";
    public static final String CURRENTSPEED = "CurrentSpeed";
    public static final String CURRENTTRACK = "CurrentTrack";
    public static final String CURRENTTRACKDURATION = "CurrentTrackDuration";
    public static final String CURRENTTRACKMETADATA = "CurrentTrackMetaData";
    public static final String CURRENTTRACKURI = "CurrentTrackURI";
    public static final String CURRENTTRANSPORTACTIONS = "CurrentTransportActions";
    public static final String CURRENTTRANSPORTSTATE = "CurrentTransportState";
    public static final String CURRENTTRANSPORTSTATUS = "CurrentTransportStatus";
    public static final String CURRENTURI = "CurrentURI";
    public static final String CURRENTURIMETADATA = "CurrentURIMetaData";
    public static final String ERROR_OCCURRED = "ERROR_OCCURRED";
    public static final String GETCURRENTTRANSPORTACTIONS = "GetCurrentTransportActions";
    public static final String GETDEVICECAPABILITIES = "GetDeviceCapabilities";
    public static final String GETMEDIAINFO = "GetMediaInfo";
    public static final String GETPOSITIONINFO = "GetPositionInfo";
    public static final String GETTRANSPORTINFO = "GetTransportInfo";
    public static final String GETTRANSPORTSETTINGS = "GetTransportSettings";
    public static final String INSTANCEID = "InstanceID";
    public static final String LASTCHANGE = "LastChange";
    public static final String MEDIADURATION = "MediaDuration";
    public static final String NEWPLAYMODE = "NewPlayMode";
    public static final String NEWRECORDQUALITYMODE = "NewRecordQualityMode";
    public static final String NEXT = "Next";
    public static final String NEXTAVTRANSPORTURI = "NextAVTransportURI";
    public static final String NEXTAVTRANSPORTURIMETADATA = "NextAVTransportURIMetaData";
    public static final String NEXTURI = "NextURI";
    public static final String NEXTURIMETADATA = "NextURIMetaData";
    public static final String NORMAL = "NORMAL";
    public static final String NRTRACKS = "NrTracks";
    public static final String NUMBEROFTRACKS = "NumberOfTracks";
    public static final String OK = "OK";
    public static final String PAUSE = "Pause";
    public static final String PLAY = "Play";
    public static final String PLAYBACKSTORAGEMEDIUM = "PlaybackStorageMedium";
    public static final String PLAYING = "PLAYING";
    public static final String PLAYMEDIA = "PlayMedia";
    public static final String PLAYMEDIUM = "PlayMedium";
    public static final String PLAYMODE = "PlayMode";
    public static final String POSSIBLEPLAYBACKSTORAGEMEDIA = "PossiblePlaybackStorageMedia";
    public static final String POSSIBLERECORDQUALITYMODES = "PossibleRecordQualityModes";
    public static final String POSSIBLERECORDSTORAGEMEDIA = "PossibleRecordStorageMedia";
    public static final String PREVIOUS = "Previous";
    public static final String RECMEDIA = "RecMedia";
    public static final String RECORD = "Record";
    public static final String RECORDMEDIUM = "RecordMedium";
    public static final String RECORDMEDIUMWRITESTATUS = "RecordMediumWriteStatus";
    public static final String RECORDSTORAGEMEDIUM = "RecordStorageMedium";
    public static final String RECQUALITYMODE = "RecQualityMode";
    public static final String RECQUALITYMODES = "RecQualityModes";
    public static final String RELATIVECOUNTERPOSITION = "RelativeCounterPosition";
    public static final String RELATIVETIMEPOSITION = "RelativeTimePosition";
    public static final String RELCOUNT = "RelCount";
    public static final String RELTIME = "RelTime";
    public static final String SCPD = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n   <specVersion>\n      <major>1</major>\n      <minor>0</minor>\n\t</specVersion>\n    <serviceStateTable>        <stateVariable>            <name>TransportState</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>            <allowedValueList>                <allowedValue>STOPPED</allowedValue>                <allowedValue>PLAYING</allowedValue>            </allowedValueList>        </stateVariable>        <stateVariable>            <name>TransportStatus</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>            <allowedValueList>                <allowedValue>OK</allowedValue>                <allowedValue>ERROR_OCCURRED</allowedValue>                       </allowedValueList>        </stateVariable>        <stateVariable>            <name>PlaybackStorageMedium</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>\t     <stateVariable>            <name>RecordStorageMedium</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>              </stateVariable>        <stateVariable>            <name>PossiblePlaybackStorageMedia</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>PossibleRecordStorageMedia</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>CurrentPlayMode</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>            <allowedValueList>                <allowedValue>NORMAL</allowedValue>            </allowedValueList>            <defaultValue>NORMAL</defaultValue>        </stateVariable>        <stateVariable>            <name>TransportPlaySpeed</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>\t         <allowedValueList>                <allowedValue>1</allowedValue>            </allowedValueList>        </stateVariable>        <stateVariable>            <sendEventsAttribute>no</sendEventsAttribute>            <name>RecordMediumWriteStatus </name>            <dataType>string</dataType>         </stateVariable>        <stateVariable>            <name>CurrentRecordQualityMode</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>          </stateVariable>        <stateVariable>            <name>PossibleRecordQualityModes</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>NumberOfTracks</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>ui4</dataType>\t\t     <allowedValueRange>\t\t\t     <minimum>0</minimum>\t\t     </allowedValueRange>         </stateVariable>        <stateVariable>            <name>CurrentTrack</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>ui4</dataType>\t\t     <allowedValueRange>\t\t\t    <minimum>0</minimum>\t\t\t    <step>1</step>\t\t     </allowedValueRange>        </stateVariable>        <stateVariable>            <name>CurrentTrackDuration</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>\t     <stateVariable>            <name>CurrentMediaDuration</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>CurrentTrackMetaData</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>CurrentTrackURI</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>AVTransportURI</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>AVTransportURIMetaData</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>NextAVTransportURI</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>NextAVTransportURIMetaData</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>RelativeTimePosition</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>AbsoluteTimePosition</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>RelativeCounterPosition</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>i4</dataType>        </stateVariable>        <stateVariable>            <name>AbsoluteCounterPosition</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>i4</dataType>        </stateVariable>        <stateVariable>\t\t<Optional/>            <name>CurrentTransportActions</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>LastChange</name>            <sendEventsAttribute>yes</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>A_ARG_TYPE_SeekMode</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>            <allowedValueList>                 <allowedValue>TRACK_NR</allowedValue>            </allowedValueList>        </stateVariable>        <stateVariable>            <name>A_ARG_TYPE_SeekTarget</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>string</dataType>        </stateVariable>        <stateVariable>            <name>A_ARG_TYPE_InstanceID</name>            <sendEventsAttribute>no</sendEventsAttribute>            <dataType>ui4</dataType>        </stateVariable>    </serviceStateTable>    <actionList>        <action>            <name>SetAVTransportURI</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>CurrentURI</name>                    <direction>in</direction>                    <relatedStateVariable>AVTransportURI</relatedStateVariable>                </argument>                <argument>                    <name>CurrentURIMetaData</name>                    <direction>in</direction>                    <relatedStateVariable>AVTransportURIMetaData</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>\t<Optional/>            <name>SetNextAVTransportURI</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>NextURI</name>                    <direction>in</direction>                    <relatedStateVariable>NextAVTransportURI</relatedStateVariable>                </argument>                <argument>                    <name>NextURIMetaData</name>                    <direction>in</direction>                    <relatedStateVariable>NextAVTransportURIMetaData</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>GetMediaInfo</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                 <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>NrTracks</name>                    <direction>out</direction>                    <relatedStateVariable>NumberOfTracks</relatedStateVariable>                </argument>                <argument>                    <name>MediaDuration</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentMediaDuration</relatedStateVariable>                </argument>                <argument>                    <name>CurrentURI</name>                    <direction>out</direction>                    <relatedStateVariable>AVTransportURI</relatedStateVariable>                </argument>\t\t         <argument>                    <name>CurrentURIMetaData</name>                    <direction>out</direction>                    <relatedStateVariable>AVTransportURIMetaData</relatedStateVariable>                </argument>                <argument>                    <name>NextURI</name>                    <direction>out</direction>                    <relatedStateVariable>NextAVTransportURI</relatedStateVariable>                </argument>\t\t         <argument>                    <name>NextURIMetaData</name>                    <direction>out</direction>                    <relatedStateVariable>NextAVTransportURIMetaData</relatedStateVariable>                </argument>                <argument>                    <name>PlayMedium</name>                    <direction>out</direction>                    <relatedStateVariable>PlaybackStorageMedium</relatedStateVariable>                </argument>                <argument>                    <name>RecordMedium</name>                    <direction>out</direction>                    <relatedStateVariable>RecordStorageMedium</relatedStateVariable>                </argument>                <argument>                    <name>WriteStatus</name>                    <direction>out</direction>                    <relatedStateVariable>RecordMediumWriteStatus </relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>GetTransportInfo</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>CurrentTransportState</name>                    <direction>out</direction>                    <relatedStateVariable>TransportState</relatedStateVariable>                </argument>                <argument>                    <name>CurrentTransportStatus</name>                    <direction>out</direction>                    <relatedStateVariable>TransportStatus</relatedStateVariable>                </argument>                <argument>                    <name>CurrentSpeed</name>                    <direction>out</direction>                    <relatedStateVariable>TransportPlaySpeed</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>GetPositionInfo</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>Track</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentTrack</relatedStateVariable>                </argument>                <argument>                    <name>TrackDuration</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentTrackDuration</relatedStateVariable>                </argument>                <argument>                    <name>TrackMetaData</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentTrackMetaData</relatedStateVariable>                </argument>                <argument>                    <name>TrackURI</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentTrackURI</relatedStateVariable>                </argument>                <argument>                    <name>RelTime</name>                    <direction>out</direction>                    <relatedStateVariable>RelativeTimePosition</relatedStateVariable>                </argument>                <argument>                    <name>AbsTime</name>                    <direction>out</direction>                    <relatedStateVariable>AbsoluteTimePosition</relatedStateVariable>                </argument>                <argument>                    <name>RelCount</name>                    <direction>out</direction>                    <relatedStateVariable>RelativeCounterPosition</relatedStateVariable>                </argument>                <argument>                    <name>AbsCount</name>                    <direction>out</direction>                    <relatedStateVariable>AbsoluteCounterPosition</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>GetDeviceCapabilities</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>PlayMedia</name>                    <direction>out</direction>                    <relatedStateVariable>PossiblePlaybackStorageMedia</relatedStateVariable>                </argument>                <argument>                    <name>RecMedia</name>                    <direction>out</direction>                    <relatedStateVariable>PossibleRecordStorageMedia</relatedStateVariable>                </argument>                <argument>                    <name>RecQualityModes</name>                    <direction>out</direction>                    <relatedStateVariable>PossibleRecordQualityModes</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>GetTransportSettings</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>PlayMode</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentPlayMode</relatedStateVariable>                </argument>                <argument>                    <name>RecQualityMode</name>                    <direction>out</direction>                 <relatedStateVariable>CurrentRecordQualityMode</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>Stop</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>Play</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>Speed</name>                    <direction>in</direction>                    <relatedStateVariable>TransportPlaySpeed</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>\t<Optional/>            <name>Pause</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>\t<Optional/>            <name>Record</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>Seek</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>Unit</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_SeekMode</relatedStateVariable>                </argument>                <argument>                    <name>Target</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_SeekTarget</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>Next</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>            <name>Previous</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>\t<Optional/>            <name>SetPlayMode</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>NewPlayMode</name>                    <direction>in</direction>                    <relatedStateVariable>CurrentPlayMode</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>\t<Optional/>            <name>SetRecordQualityMode</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>NewRecordQualityMode</name>                    <direction>in</direction>                    <relatedStateVariable>CurrentRecordQualityMode</relatedStateVariable>                </argument>            </argumentList>        </action>        <action>\t<Optional/>            <name>GetCurrentTransportActions</name>            <argumentList>                <argument>                    <name>InstanceID</name>                    <direction>in</direction>                    <relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable>                </argument>                <argument>                    <name>Actions</name>                    <direction>out</direction>                    <relatedStateVariable>CurrentTransportActions</relatedStateVariable>                </argument>            </argumentList>        </action>    </actionList></scpd>";
    public static final String SEEK = "Seek";
    public static final String SERVICE_TYPE = "urn:schemas-upnp-org:service:AVTransport:1";
    public static final String SETAVTRANSPORTURI = "SetAVTransportURI";
    public static final String SETNEXTAVTRANSPORTURI = "SetNextAVTransportURI";
    public static final String SETPLAYMODE = "SetPlayMode";
    public static final String SETRECORDQUALITYMODE = "SetRecordQualityMode";
    public static final String SPEED = "Speed";
    public static final String STOP = "Stop";
    public static final String STOPPED = "STOPPED";
    public static final String TARGET = "Target";
    public static final String TRACK = "Track";
    public static final String TRACKDURATION = "TrackDuration";
    public static final String TRACKMETADATA = "TrackMetaData";
    public static final String TRACKURI = "TrackURI";
    public static final String TRACK_NR = "TRACK_NR";
    public static final String TRANSPORTPLAYSPEED = "TransportPlaySpeed";
    public static final String TRANSPORTSTATE = "TransportState";
    public static final String TRANSPORTSTATUS = "TransportStatus";
    public static final String UNIT = "Unit";
    public static final String WRITESTATUS = "WriteStatus";
    private AVTransportInfoList avTransInfoList;
    private MediaRenderer mediaRenderer;
    private Mutex mutex = new Mutex();

    public AVTransport(MediaRenderer mediaRenderer) {
        setMediaRenderer(mediaRenderer);
        this.avTransInfoList = new AVTransportInfoList();
    }

    private void setMediaRenderer(MediaRenderer mediaRenderer) {
        this.mediaRenderer = mediaRenderer;
    }

    @Override // org.cybergarage.upnp.control.ActionListener
    public boolean actionControlReceived(Action action) {
        boolean z;
        ActionListener actionListener;
        String name = action.getName();
        if (name == null) {
            return false;
        }
        boolean z2 = true;
        if (name.equals(SETAVTRANSPORTURI)) {
            AVTransportInfo aVTransportInfo = new AVTransportInfo();
            aVTransportInfo.setInstanceID(action.getArgument("InstanceID").getIntegerValue());
            aVTransportInfo.setURI(action.getArgument(CURRENTURI).getValue());
            aVTransportInfo.setURIMetaData(action.getArgument(CURRENTURIMETADATA).getValue());
            setCurrentAvTransInfo(aVTransportInfo);
            z = true;
        } else {
            z = false;
        }
        if (name.equals(SETNEXTAVTRANSPORTURI)) {
            AVTransportInfo aVTransportInfo2 = new AVTransportInfo();
            aVTransportInfo2.setInstanceID(action.getArgument("InstanceID").getIntegerValue());
            aVTransportInfo2.setURI(action.getArgument(NEXTURI).getValue());
            aVTransportInfo2.setURIMetaData(action.getArgument(NEXTURIMETADATA).getValue());
            setNextAvTransInfo(aVTransportInfo2);
            z = true;
        }
        if (name.equals(GETMEDIAINFO)) {
            int integerValue = action.getArgument("InstanceID").getIntegerValue();
            synchronized (this.avTransInfoList) {
                int size = this.avTransInfoList.size();
                for (int i = 0; i < size; i++) {
                    AVTransportInfo aVTransportInfo3 = this.avTransInfoList.getAVTransportInfo(i);
                    if (aVTransportInfo3 != null && aVTransportInfo3.getInstanceID() == integerValue) {
                        action.getArgument(CURRENTURI).setValue(aVTransportInfo3.getURI());
                        action.getArgument(CURRENTURIMETADATA).setValue(aVTransportInfo3.getURIMetaData());
                    }
                }
            }
            return false;
        }
        if (name.equals("Play")) {
            action.getArgument("InstanceID").getIntegerValue();
            action.getArgument("Speed").getIntegerValue();
            z = true;
        }
        if (name.equals("Stop")) {
            action.getArgument("InstanceID").getIntegerValue();
            z = true;
        }
        if (name.equals("Pause")) {
            action.getArgument("InstanceID").getIntegerValue();
        } else {
            z2 = z;
        }
        MediaRenderer mediaRenderer = getMediaRenderer();
        if (mediaRenderer != null && (actionListener = mediaRenderer.getActionListener()) != null) {
            actionListener.actionControlReceived(action);
        }
        return z2;
    }

    public AVTransportInfoList getAvTransInfoList() {
        return this.avTransInfoList;
    }

    public AVTransportInfo getCurrentAvTransInfo() {
        synchronized (this.avTransInfoList) {
            if (this.avTransInfoList.size() < 1) {
                return null;
            }
            return this.avTransInfoList.getAVTransportInfo(0);
        }
    }

    public MediaRenderer getMediaRenderer() {
        return this.mediaRenderer;
    }

    public AVTransportInfo getNextAvTransInfo() {
        synchronized (this.avTransInfoList) {
            if (this.avTransInfoList.size() < 2) {
                return null;
            }
            return this.avTransInfoList.getAVTransportInfo(1);
        }
    }

    public void lock() {
        this.mutex.lock();
    }

    @Override // org.cybergarage.upnp.control.QueryListener
    public boolean queryControlReceived(StateVariable stateVariable) {
        return false;
    }

    public void setCurrentAvTransInfo(AVTransportInfo aVTransportInfo) {
        AVTransportInfoList avTransInfoList = getAvTransInfoList();
        synchronized (avTransInfoList) {
            if (1 <= avTransInfoList.size()) {
                avTransInfoList.remove(0);
            }
            avTransInfoList.insertElementAt(aVTransportInfo, 0);
        }
    }

    public void setNextAvTransInfo(AVTransportInfo aVTransportInfo) {
        synchronized (this.avTransInfoList) {
            if (2 <= this.avTransInfoList.size()) {
                this.avTransInfoList.remove(0);
            }
            this.avTransInfoList.insertElementAt(aVTransportInfo, 1);
        }
    }

    public void unlock() {
        this.mutex.unlock();
    }
}
