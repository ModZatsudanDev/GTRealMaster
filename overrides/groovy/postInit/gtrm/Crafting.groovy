//recipe add
crafting.addShaped('balanced_clay', item('minecraft:clay_ball') * 3, [
        [item('minecraft:nether_star'), null, item('minecraft:nether_star')],
        [null, ore('ingotIron'), null], 
        [item('minecraft:nether_star'), null, item('minecraft:nether_star')]
])
crafting.addShapeless('unbalanced_clay', item('minecraft:clay_ball') * 32, [item('minecraft:dirt'), item('minecraft:dirt'), item('minecraft:leather')])

//recipe remove
crafting.remove(String name) // removes the recipe with the same name
crafting.removeByOutput(IIngredient output) // removes all recipes with the output