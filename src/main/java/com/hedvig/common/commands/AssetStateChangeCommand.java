package com.hedvig.common.commands;

import com.hedvig.common.constant.AssetState;
import lombok.Value;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Value
public class AssetStateChangeCommand {

    @TargetAggregateIdentifier
    private String id;

    private String assetId;

    private AssetState state;

}
